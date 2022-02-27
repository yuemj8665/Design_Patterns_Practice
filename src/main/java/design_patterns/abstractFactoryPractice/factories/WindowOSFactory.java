package design_patterns.abstractFactoryPractice.factories;

import design_patterns.abstractFactoryPractice.buttons.Button;
import design_patterns.abstractFactoryPractice.buttons.WindowOSButton;
import design_patterns.abstractFactoryPractice.checkBoxes.Checkbox;
import design_patterns.abstractFactoryPractice.checkBoxes.WindowOSCheckbox;

/**
 * 각 Factory는 기본 Factory를 확장하며 단일 생성자를 만들게 된다.
 */
public class WindowOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowOSCheckbox();
    }
}
