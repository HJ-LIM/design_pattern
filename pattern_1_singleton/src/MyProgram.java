/**
 * singleton pattern
 *
 * 전역 변수를 사용하지 않고 객체 하나만 생성하도록 하며, 생성된 객체를 어디에서든지
 * 참주할수 있도록 하는 패턴.
 */
public class MyProgram {
    public static void main(String[] args) {
        new FirstPage().setAndPrintSettings();
        new SecondPage().printSettings();
    }
}
