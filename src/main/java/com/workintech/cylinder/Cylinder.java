package com.workintech.cylinder;

public class Cylinder extends  Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }
}
