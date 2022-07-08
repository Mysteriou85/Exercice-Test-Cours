package fr.experimentation.factorybutton.factory;

import fr.experimentation.factorybutton.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}