package design_patterns.abstractFactoryPractice.buttons;

/**
 * 모든 클래스에는 동일한 인터페이스를 상속하고 있다.
 * 이 클래스는 버튼 클래스이다.
 */
public class MacOSButton implements Button {
    @Override
    public void print() {
        System.out.println("You have created MacOSButton.");
    }
}
