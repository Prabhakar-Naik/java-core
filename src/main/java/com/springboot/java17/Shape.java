package com.springboot.java17;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public sealed class Shape permits Circle, Rectangle {

    private String color;
    private Shape shape;

    public Shape(String color) {
        this.color = color;
        this.shape = getShape();
    }

    public String getColor() {
        return color;
    }
    public Shape getShape() {
        return shape;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }


}
