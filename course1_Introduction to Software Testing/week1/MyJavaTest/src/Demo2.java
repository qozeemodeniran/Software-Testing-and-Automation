import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        double r, area, circum;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter radius: ");
        r = reader.nextDouble();

        circum = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);

        System.out.println("For a circle with radius " + r + ", ");
        System.out.println(" the circumference is " + circum);
        System.out.println(" and the area is " + area + ".");

        reader.close();
    }
}
