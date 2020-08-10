/**
 * state pattern
 *
 * 객체가 특정 상태에 따라 다른 행위를 달리하는 상황에서,
 * 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고,
 * 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴을 말한다.
 *
 * 즉, 객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 메서드로 정의한다.
 *
 */
public class MyProgram {
    public static void main(String[] args) {
        ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
    }
}
