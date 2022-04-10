package design_patterns.factoryMethodPractice.factory;

import design_patterns.factoryMethodPractice.buttons.Button;
import design_patterns.factoryMethodPractice.buttons.HttpButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HttpButton();
    }
}
