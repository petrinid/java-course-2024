package org.ethz.day1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");

        int number = input.nextInt();

        int prov;
        int product = 1;
        while (number > 0) {
            prov = number % 10;
            product *= prov;
            number /= 10;
        }

        System.out.println(product);

    }
    
}
