package design_patterns.factoryMethodPractice;

import design_patterns.factoryMethodPractice.factory.Dialog;
import design_patterns.factoryMethodPractice.factory.HtmlDialog;
import design_patterns.factoryMethodPractice.factory.WindowsDialog;

public class factoryMethodPracticeApplication {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
