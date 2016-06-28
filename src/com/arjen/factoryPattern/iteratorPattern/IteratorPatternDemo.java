package com.arjen.factoryPattern.iteratorPattern;

import com.arjen.factoryPattern.Shape;

/**
 * Created by arjen on 27-6-2016.
 */
public class IteratorPatternDemo {

    public void testIteratorPattern(){

        ShapeRepository shapeRepository = new ShapeRepository();

        System.out.println("\nIterator Pattern: ");

        for(Iterator iterator = shapeRepository.getIterator(); iterator.hasNext();){
            Shape shape = (Shape) iterator.next();
            shape.draw();
        }
    }
}
