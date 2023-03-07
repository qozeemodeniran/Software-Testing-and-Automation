package testing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side_1 = reader.nextInt();

        System.out.print("Enter side 2: ");
        int side_2 = reader.nextInt();

        System.out.print("Enter side 3: ");
        int side_3 = reader.nextInt();

        if (isTrinagle(side_1, side_2, side_3)) {
            System.out.println("This is a triangle.");
        } else {
            System.out.println("This is not a triangle");
        }

        reader.close();
    }

    public static boolean isTrinagle(double a, double b, double c) {
        if ((a+b > c) && (a+c > b) && (b+c > a)) {
            return true;
        } 
        return false;
    }
}