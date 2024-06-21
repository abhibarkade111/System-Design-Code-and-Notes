package system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern;

import system.design.designPattern.StrategyDesignPattern.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}
