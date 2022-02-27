package design_patterns.abstractFactoryPractice.checkBoxes;

public class WindowOSCheckbox implements Checkbox{
    @Override
    public void print() {
        System.out.println("you have created WindowOSCheckbox");
    }
}
