package com.arjen.factoryPattern.decoratorPattern;

import com.arjen.factoryPattern.Shape;

/**
 * Created by arjen on 27-6-2016.
 */
public class greenShapeDecorator extends ShapeDecorator {

    public greenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape){
        System.out.println("Border color  is green");
    }
}
