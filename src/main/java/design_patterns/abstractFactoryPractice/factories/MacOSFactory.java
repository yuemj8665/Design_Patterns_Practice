package design_patterns.abstractFactoryPractice.factories;

import design_patterns.abstractFactoryPractice.buttons.Button;
import design_patterns.abstractFactoryPractice.buttons.MacOSButton;
import design_patterns.abstractFactoryPractice.checkBoxes.Checkbox;
import design_patterns.abstractFactoryPractice.checkBoxes.MacOSCheckbox;

/**
 * 각 Factory는 기본 Factory를 확장하며 단일 생성자를 만들게 된다.
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
