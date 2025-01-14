package com.workintech.cylinder;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}