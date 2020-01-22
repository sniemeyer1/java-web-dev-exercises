package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double area;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Please enter a positive number.");
        }else {
            System.out.println("The area of the circle is: " + Circle.getArea(radius));
        }
    }
}
