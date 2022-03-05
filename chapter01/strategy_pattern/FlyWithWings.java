package chapter01.strategy_pattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고있어요!!");
    }
}
