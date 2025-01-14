package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }
    public double getVolume() {
        return super.getArea() * getHeight();
    }
}
