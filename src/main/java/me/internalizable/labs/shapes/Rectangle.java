package me.internalizable.labs.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape {

    private double height;
    private double width;

    @Override
    public String toString() {
        return super.toString() + "- Rectangle";
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

}
