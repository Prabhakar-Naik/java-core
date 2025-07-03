package com.springboot.java17;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public final class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
