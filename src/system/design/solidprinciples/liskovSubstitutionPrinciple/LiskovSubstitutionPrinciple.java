package system.design.solidprinciples.liskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new NewBike());
        list.add(new NewCar());
        list.add(new NewBiCycle());
        for(Vehicle vehicle : list){
            System.out.println(vehicle.getNumberOfWheels());
        }

        // second way
        List<EngineVehicle> list2 = new ArrayList<>();
        list2.add(new NewBike());
        list2.add(new NewCar());
        // here we are not allowed to add bicycle so our code not getting break.
//        list2.add(new NewBiCycle());
        for(EngineVehicle engineVehicle : list2){
            System.out.println(engineVehicle.hasEngine());
            System.out.println(engineVehicle.getNumberOfWheels());
        }
    }
}

interface Bike{
    void turnEngineOn();
    void accelerate();
}

class MotorCycle implements Bike{

    @Override
    public void turnEngineOn() {
        // logic
    }

    @Override
    public void accelerate() {
        // logic
    }
}

class BiCycle implements Bike{

    @Override
    public void turnEngineOn() {
        throw new AssertionError("No Engine");
    }

    @Override
    public void accelerate() {
        // logic
    }
}

// In the above code Class BiCycle narrow down the capabilities of the parent class Bike so it doesn't follow the
// Liskov Substitution Principle.

//Let's how to avoid this problem

class Vehicle{
    int getNumberOfWheels(){
        return 2;
    }
}

class EngineVehicle extends Vehicle{
    boolean hasEngine(){
        return true;
    }
}

class NewBike extends EngineVehicle{

}

class NewCar extends EngineVehicle{
    @Override
    int getNumberOfWheels(){
        return 4;
    }
}

class NewBiCycle extends Vehicle{

}