package system.design.designPattern.DecorativeDesignPattern.Decorator;

import system.design.designPattern.DecorativeDesignPattern.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
