package com.company;

public class Shape {

    String color;
    boolean filled;

    public String getColor () {
        return color;
    }

    public void setColor () {
        this.color = color;
    }


    public boolean getFilled () {
        return filled;
    }

    public void setFilled (boolean filled) {
        this.filled = filled;
    }


    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void printShape() {
        System.out.println("The shape is " + color + ", shape is filled = " + filled);
    }




}
