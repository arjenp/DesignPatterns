package com.arjen.factoryPattern.visitorPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public class VisitorPatternDemo {

    public void testVisitorPattern(){

        DrawingPart drawing = new Drawing();

        System.out.println("\nVisitor pattern: ");
        drawing.accept(new DrawingPartDisplayVisitor());
    }


}
