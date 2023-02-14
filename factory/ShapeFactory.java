package factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "Square":
                return new Square();
        }
        return null;
    }
}
