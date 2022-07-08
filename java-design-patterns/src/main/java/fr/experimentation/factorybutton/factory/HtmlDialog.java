package fr.experimentation.factorybutton.factory;

import fr.experimentation.factorybutton.buttons.Button;
import fr.experimentation.factorybutton.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}