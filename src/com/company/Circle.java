package com.company;

public class Circle extends Shape {

    double radius;


public Circle (String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
