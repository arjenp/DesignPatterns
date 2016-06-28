package com.arjen.factoryPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class FactoryPatternDemo {

    public void testFactoryPattern(){

        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("\nFactory pattern: ");

        Shape shapeCircle = shapeFactory.getShape("Circle");

        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getShape("Rectangle");

        shapeRectangle.draw();

        Shape shapeSquare = shapeFactory.getShape("Square");

        shapeSquare.draw();
    }
}
