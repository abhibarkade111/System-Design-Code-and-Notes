package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriverStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
