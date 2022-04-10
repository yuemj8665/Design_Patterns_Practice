package design_patterns.factoryMethodPractice.factory;

import design_patterns.factoryMethodPractice.buttons.Button;
import design_patterns.factoryMethodPractice.buttons.WindowsButtons;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButtons();
    }

}
