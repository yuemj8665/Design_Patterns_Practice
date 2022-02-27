package design_patterns.abstractFactoryPractice.buttons;

/**
 * Abstract Factory는 여러개가 있다.
 * 별도의 클래스 계층 구조(버튼과 체크박스)로 구성된다.
 * 동일한 클래스에는 공통 인터페이스가 있다.
 *
 * 현재 작성하는 인터페이스가 공통 인터페이스이다.
 */
public interface Button {
    void print();
}
