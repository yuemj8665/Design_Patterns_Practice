package design_patterns.abstractFactoryPractice.buttons;

/**
 * 모든 클래스에는 동일한 인터페이스를 상속하고 있다.
 */
public class WindowOSButton implements Button {

    @Override
    public void print() {
        System.out.println("you have created windowOSButton");
    }
}
