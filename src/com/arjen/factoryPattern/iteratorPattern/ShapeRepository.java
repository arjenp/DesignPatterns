package com.arjen.factoryPattern.iteratorPattern;

import com.arjen.factoryPattern.Circle;
import com.arjen.factoryPattern.Rectangle;
import com.arjen.factoryPattern.Shape;
import com.arjen.factoryPattern.Square;

/**
 * Created by arjen on 27-6-2016.
 */
public class ShapeRepository implements Container {

    public Shape shapes[] = {new Circle(),new Rectangle(), new Square()};

    @Override
    public Iterator getIterator() {
        return new ShapeIterator();
    }

    private class ShapeIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {

            if(index < shapes.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return shapes[index++];
            }
            return null;
        }
    }
}

