package com.arjen.factoryPattern.visitorPattern;

/**
 * Created by arjen on 27-6-2016.
 */
public interface DrawingPart {
    void accept(DrawingPartVisitor drawingPartVisitor);
}
