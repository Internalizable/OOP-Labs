package me.internalizable.labs.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {

    private double radius;

    @Override
    public String toString() {
        return super.toString() + "- Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
