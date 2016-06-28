package com.arjen.factoryPattern.visitorPattern;

import com.arjen.factoryPattern.Circle;
import com.arjen.factoryPattern.Rectangle;
import com.arjen.factoryPattern.Square;

/**
 * Created by arjen on 27-6-2016.
 */
public interface DrawingPartVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Square square);
    void visit(Drawing drawing);
}

