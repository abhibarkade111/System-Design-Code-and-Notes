package system.design.designPattern.StrategyDesignPattern.WithoutStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Special Driveing Functionlaity");
        // here some special logic
    }
}
