package system.design.designPattern.StrategyDesignPattern.WithoutStrategyDesignPattern;

public class SportyVehicle extends Vehicle {
    @Override
    public void drive(){
        System.out.println("Special driving functinality");
        // here some special logic
    }
}
