package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.max(length, 0);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getArea() {
        return getWidth() * getLength();
    }


}
