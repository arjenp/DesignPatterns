package com.arjen.factoryPattern.decoratorPattern;

import com.arjen.factoryPattern.Circle;
import com.arjen.factoryPattern.Rectangle;
import com.arjen.factoryPattern.Shape;

/**
 * Created by arjen on 27-6-2016.
 */
public class DecoratorPatternDemo {

    public void testDecoratorPattern(){

        Shape circle = new Circle();

        Shape blueCircle = new greenShapeDecorator(new Circle());

        Shape blueRectangle = new greenShapeDecorator(new Rectangle());

        System.out.println("\nDecorator Pattern: ");

        System.out.println("Cirle with a normal border");

        circle.draw();

        System.out.println("\nWIth a color!");

        blueCircle.draw();

        System.out.println("");
        blueRectangle.draw();
    }
}
