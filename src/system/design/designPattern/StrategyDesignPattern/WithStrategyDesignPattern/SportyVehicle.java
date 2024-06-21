package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern;

import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
