package me.internalizable.labs.shapes;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ShapesFactory {

    @Getter
    public static ArrayList<Shape> shapeArrayList = new ArrayList<>();

    @Getter
    public static Random colorRandom = new Random();

    public static void sortShapes() {
        shapeArrayList.sort(new ShapeComparator());
    }

    public static void printArrayList() {
        shapeArrayList.forEach(shape -> {
            System.out.println();
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        });
    }
}
