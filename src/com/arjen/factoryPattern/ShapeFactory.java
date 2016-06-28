package com.arjen.factoryPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle": return new Circle();

            case "Rectangle": return new Rectangle();

            case "Square": return new Square();

            default: shapeType = null;
                break;

        }
        return null;
    }
}
