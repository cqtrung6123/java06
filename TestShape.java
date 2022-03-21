package ExampleShape;

import ExampleShape.Shape;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Triangle obj1=new Triangle();
        obj1.setBase(5);
        obj1.setHeight(7);
        System.out.println("Area triangle: " +obj1.getArea());
        Rectangle obj2=new Rectangle();
        System.out.println("================================");
        obj2.setLength(10);
        obj2.setWidth(5);
        System.out.println("Area rectangle: " +obj2.getArea());




    }
}
