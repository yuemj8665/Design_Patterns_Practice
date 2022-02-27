package design_patterns.abstractFactoryPractice;

import design_patterns.abstractFactoryPractice.app.Application;
import design_patterns.abstractFactoryPractice.factories.GUIFactory;
import design_patterns.abstractFactoryPractice.factories.MacOSFactory;
import design_patterns.abstractFactoryPractice.factories.WindowOSFactory;

/**
 * Demo.javaj에서 모든거 모입니다.
 */
public class AbstractFactoryPractice_Application {
    /**
     * Application은 구성 또는 환경변수에 따라 팩토리 유형을 선택하고 초기화 단계에 생성합니다.
     */
    private static Application configureAppcation() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowOSFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureAppcation();
        app.print();
    }
}
