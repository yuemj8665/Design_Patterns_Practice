package design_patterns.factoryMethodPractice.buttons;

public class HttpButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Buttons</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says, 'Hello World!'");
    }
}
