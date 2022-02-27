package design_patterns.abstractFactoryPractice.app;

import design_patterns.abstractFactoryPractice.buttons.Button;
import design_patterns.abstractFactoryPractice.checkBoxes.Checkbox;
import design_patterns.abstractFactoryPractice.factories.GUIFactory;

/**
 * Factory의 사용자는 추상 인터페이스를 통해 클래스를 생성하기 때문에
 * 어떤 구체적인 Factory를 사용하는지 상관하지 않는다.
 */

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void print() {
        button.print();
        checkbox.print();
    }
}
