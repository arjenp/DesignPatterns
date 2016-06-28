package com.arjen.factoryPattern.visitorPattern;

import com.arjen.factoryPattern.Circle;
import com.arjen.factoryPattern.Rectangle;
import com.arjen.factoryPattern.Square;

/**
 * Created by arjen on 27-6-2016.
 */
public class DrawingPartDisplayVisitor implements DrawingPartVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("showing circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("showing rectangle");

    }

    @Override
    public void visit(Square square) {
        System.out.println("showing square");

    }

    @Override
    public void visit(Drawing drawing) {
        System.out.println("Show drawing");
    }
}
