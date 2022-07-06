// import du pom pour utilisé le "ObjectMapper"
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class HttpClientAsynchronous {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String key = "8118ed6ee68db2debfaaa5a44c832918";
        System.out.println("Rechercher une ville");
        String cityRecherche = scanner.nextLine();
        String city = "nantes";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.openweathermap.org/data/2.5/weather?q=" + cityRecherche + "&appid=" + key))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        String result = response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);

        System.out.println(result);

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> map = mapper.readValue(result, Map.class);
        MeteoInfoJson meteoInfoJson = mapper.convertValue(map, MeteoInfoJson.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ville : ").append(meteoInfoJson.getName()).append("\n")
                .append("Description :").append(meteoInfoJson.getWeather().get(0)).append("\n")
                .append("Température : ").append(meteoInfoJson.getMain().getTemp()).append("°C").append("\n")
                .append("Température ressentie : ").append(meteoInfoJson.getMain().getFeels_like()).append("°C").append("\n")
                // .append("Température min : ").append(meteoInfoJson.getMain().getTemp_min()).append("°C").append("\n")
                // .append("Température max : ").append(meteoInfoJson.getMain().getTemp_max()).append("°C").append("\n")
                .append("Pression : ").append(meteoInfoJson.getMain().getPressure()).append("\n")

                .append("Humidité : ").append(meteoInfoJson.getMain().getHumidity()).append("\n");
        System.out.println(stringBuilder);





    }

}