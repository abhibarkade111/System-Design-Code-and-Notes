package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern;

import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
