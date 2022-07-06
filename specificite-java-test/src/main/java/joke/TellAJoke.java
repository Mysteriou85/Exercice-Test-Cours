package joke;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TellAJoke {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get("D:\\project\\ProjetIntelliJIDEA\\Exercice-Test-Cours\\specificite-java-test\\src\\main\\resources\\jokes.txt");

        Scanner scanner = new Scanner(System.in);
        try {
            List<String> questions = new ArrayList<>();
            List<String> reponses = new ArrayList<>();
            List<String> content = Files.readAllLines(path);

            for (String line : content) {
                if (content.indexOf(line) % 2 == 0) {
                    questions.add(line);
                } else {
                    reponses.add(line);
                }
            }

            System.out.println("Nombre question ?");
            int nombreQuest = scanner.nextInt();
            System.out.println(questions.get(nombreQuest - 1));
            System.out.println(reponses.get(nombreQuest - 1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
