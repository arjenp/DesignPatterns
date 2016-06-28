package com.arjen.factoryPattern.decoratorPattern;

import com.arjen.factoryPattern.Shape;

/**
 * Created by arjen on 27-6-2016.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public  ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){

        decoratedShape.draw();
    }
}

