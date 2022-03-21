package ExampleShape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(){
    }
    public Triangle(double base,double height) {
        this.base=base;
        this.height=height;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height*base)/2;
    }

    @Override
    public String toString() {
        return "Area Triangle: " + getArea();
    }

}
