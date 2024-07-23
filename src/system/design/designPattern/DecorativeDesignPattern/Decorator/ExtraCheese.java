package system.design.designPattern.DecorativeDesignPattern.Decorator;

import system.design.designPattern.DecorativeDesignPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
