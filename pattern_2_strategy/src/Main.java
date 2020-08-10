/**
 * strategy pattern (전략개턴)
 *
 * 객체들이 할 수 있는 행위 각각에 전략 클래스를 생성하고, 유사한 행위들을 캡슐화 하는
 * 인터페이스를 정의하여, 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고
 * 전략을 바꿔주기만 함으로써 행위를 유연하게 확장하는 패턴.
 */
public class Main {
    public static void main(String[] args) {
        MyProgram myProgram = new MyProgram();
        myProgram.testProgram();
    }
}
