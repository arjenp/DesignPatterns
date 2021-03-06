package com.arjen.factoryPattern;

import com.arjen.factoryPattern.visitorPattern.DrawingPart;
import com.arjen.factoryPattern.visitorPattern.DrawingPartVisitor;

/**
 * Created by arjen on 27-6-2016.
 */
public class Rectangle implements Shape, DrawingPart {
    @Override
    public void draw() {
        System.out.println("This is a rectangle!");

    }

    @Override
    public void accept(DrawingPartVisitor drawingPartVisitor) {
        drawingPartVisitor.visit(this);
    }
}
