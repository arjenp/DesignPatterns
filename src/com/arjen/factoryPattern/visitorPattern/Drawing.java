package com.arjen.factoryPattern.visitorPattern;

import com.arjen.factoryPattern.Circle;
import com.arjen.factoryPattern.Rectangle;
import com.arjen.factoryPattern.Square;

/**
 * Created by arjen on 27-6-2016.
 */
public class Drawing implements DrawingPart {

    DrawingPart[] parts;

    public Drawing(){
        parts = new DrawingPart[]{new Circle(), new Rectangle(), new Square()};

    }

    @Override
    public void accept(DrawingPartVisitor drawingPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(drawingPartVisitor);
        }
        drawingPartVisitor.visit(this);
    }
}
