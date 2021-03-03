package me.internalizable.labs.shapes;

public interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

    default void show() {
        System.out.println("Hello, I'm a default method!");
    }
}
