package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern;

import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.DriverStrategy;
import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
