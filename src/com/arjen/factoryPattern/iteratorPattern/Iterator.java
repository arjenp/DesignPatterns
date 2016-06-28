package com.arjen.factoryPattern.iteratorPattern;

import java.util.Objects;

/**
 * Created by arjen on 27-6-2016.
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
