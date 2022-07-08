package fr.experimentation.factorybutton.factory;

import fr.experimentation.factorybutton.buttons.Button;
import fr.experimentation.factorybutton.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}