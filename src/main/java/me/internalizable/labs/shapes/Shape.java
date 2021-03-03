package me.internalizable.labs.shapes;

import java.awt.*;

public abstract class Shape implements Moveable {

    private Color color = new Color(ShapesFactory.getColorRandom().nextInt(255),
                                        ShapesFactory.getColorRandom().nextInt(255),
                                             ShapesFactory.getColorRandom().nextInt(255));

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return color.getRed() + "-" + color.getGreen() + "-" + color.getBlue();
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up!");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down!");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left!");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right!");
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
