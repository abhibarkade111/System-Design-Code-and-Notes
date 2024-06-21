package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern;

import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.DriverStrategy;

public class Vehicle {
    DriverStrategy driverStrategy;
    Vehicle(DriverStrategy driverStrategy){
        this.driverStrategy = driverStrategy;
    }

    public void drive(){
        driverStrategy.drive();
    }
}
