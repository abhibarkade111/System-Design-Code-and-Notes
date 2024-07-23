package system.design.designPattern.DecorativeDesignPattern;

import system.design.designPattern.DecorativeDesignPattern.Decorator.ExtraCheese;
import system.design.designPattern.DecorativeDesignPattern.Decorator.Mushroom;

public class Client {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Paneer()));
        System.out.println(pizza.cost());
    }
}
