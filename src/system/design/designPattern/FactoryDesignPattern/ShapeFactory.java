package system.design.designPattern.FactoryDesignPattern;

public class ShapeFactory {

    Shape getShape(String inputShape){
        if(inputShape.equals("CIRCLE")){
            return new Circle();
        }
        else if(inputShape.equals("RECTANGLE")){
            return new Rectangle();
        }
        else if(inputShape.equals("SQUARE")){
            return new Square();
        }
        else return null;
    }
}
