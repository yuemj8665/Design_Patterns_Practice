package design_patterns.abstractFactoryPractice.factories;

import design_patterns.abstractFactoryPractice.buttons.Button;
import design_patterns.abstractFactoryPractice.checkBoxes.Checkbox;

/**
 * Abstract factory는 모든 Abstract 생성자 타입을 알고있어야 한다.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
