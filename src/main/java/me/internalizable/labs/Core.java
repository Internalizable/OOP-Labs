package me.internalizable.labs;

import lombok.SneakyThrows;
import me.internalizable.labs.company.departments.Department;
import me.internalizable.labs.company.employees.FullTime;
import me.internalizable.labs.company.employees.PartTime;
import me.internalizable.labs.runtime.Chronometer;
import me.internalizable.labs.runtime.ChronometerMillis;
import me.internalizable.labs.shapes.Circle;
import me.internalizable.labs.shapes.Rectangle;
import me.internalizable.labs.shapes.Shape;
import me.internalizable.labs.shapes.ShapesFactory;

import java.util.Comparator;
import java.util.Scanner;

public class Core {

    @SneakyThrows
    public static void main(String[] args) {

        /**
         * Testing out Lab 1- Chronometer
         */

        Chronometer chronometer = new Chronometer();
        chronometer.start();

        for(int i = 0; i < 5230; i++)
            chronometer.increment();

        chronometer.stop();

        ChronometerMillis chronometerMillis = new ChronometerMillis();
        chronometerMillis.start();

        //Thread.sleep(79530); // Sleep for amount.

        chronometerMillis.stop();

        /**
         * Testing out employees and departments.
         */

        Department department = new Department();

        FullTime fullTime = new FullTime("Elie Sfeir", 12312, 100, 4000, 123);
        department.assign(fullTime);

        PartTime partTime = new PartTime("Jad Abou Zeid", 123, 20, 10, 31);
        department.assign(partTime);

        department.printEmployees();

        /**
         * Testing out abstraction with shapes
         */

        String inputtedC = null;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Input [circle/rectangle] [radius/height] [width]:");

            inputtedC = scanner.nextLine();

            String[] commandArgs = inputtedC.split("\\s+");

            while (commandArgs.length > 3 || commandArgs.length <= 1 && !commandArgs[0].equalsIgnoreCase("exit")
                    || !commandArgs[0].equalsIgnoreCase("circle") && !commandArgs[0].equalsIgnoreCase("rectangle") &&
                        !commandArgs[0].equalsIgnoreCase("exit")) {
                System.out.println("Unknown arguments! Use [circle/rectangle] [radius/height] [width]:");

                inputtedC = scanner.nextLine();
                commandArgs = inputtedC.split("\\s+");
            }

            if(commandArgs[0].equalsIgnoreCase("circle")) {
                double radius = Double.parseDouble(commandArgs[1]);

                Circle circle = new Circle();
                circle.setRadius(radius);

                ShapesFactory.getShapeArrayList().add(circle);
            }

            if(commandArgs[0].equalsIgnoreCase("rectangle")) {
                double height = Double.parseDouble(commandArgs[1]);

                while(commandArgs.length != 3) {
                    System.out.println("Unknown arguments! Use [circle/rectangle] [radius/height] [width]:");

                    inputtedC = scanner.nextLine();
                    commandArgs = inputtedC.split("\\s+");
                }

                double width = Double.parseDouble(commandArgs[2]);

                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(width);

                ShapesFactory.getShapeArrayList().add(rectangle);
            }

        } while(!inputtedC.equalsIgnoreCase("exit"));


        ShapesFactory.sortShapes(); // I would've preferred the following commented method.

        //ShapesFactory.getShapeArrayList().sort(Comparator.comparingDouble(Shape::getArea));
        ShapesFactory.printArrayList();
    }

}
