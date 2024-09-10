package org.ethz.day1;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");

        double radius = input.nextDouble();

        double area = radius * radius * pi;
        double circumference = 2 * radius * pi;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    

        
    }
    
}
