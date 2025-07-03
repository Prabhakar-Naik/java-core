package com.springboot.java17;

/**
 * @author prabhakar, @Date 28-06-2025
 */
public final class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("RED");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

}
