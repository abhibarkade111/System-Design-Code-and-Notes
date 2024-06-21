package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy;

public class SpecialDriveStrategy implements DriverStrategy {
    @Override
    public void drive() {
        System.out.println("Here is a special drive strategy");
        // here some special logic
    }
}
