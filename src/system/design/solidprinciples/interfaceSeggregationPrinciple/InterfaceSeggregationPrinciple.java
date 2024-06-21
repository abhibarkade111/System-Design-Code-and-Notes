package system.design.solidprinciples.interfaceSeggregationPrinciple;

public class InterfaceSeggregationPrinciple {
    public static void main(String[] args) {

    }
}

interface WaiterInterface{
    void serveCustomer();
}

interface CheffInterFace{
    void cookFood();
}

class Waiter implements WaiterInterface{

    @Override
    public void serveCustomer() {
        System.out.println("Serving");
    }
}

class Cheff implements CheffInterFace{

    @Override
    public void cookFood() {
        System.out.println("Cooking");
    }
}
