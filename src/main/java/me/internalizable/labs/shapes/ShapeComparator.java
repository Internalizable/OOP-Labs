package me.internalizable.labs.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape firstObject = (Shape) o1;
        Shape secondObject = (Shape) o2;

        return Double.compare(firstObject.getArea(), secondObject.getArea());
    }

}
