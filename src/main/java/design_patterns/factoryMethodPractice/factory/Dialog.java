package design_patterns.factoryMethodPractice.factory;

import design_patterns.factoryMethodPractice.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
