package system.design.designPattern.FactoryDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
