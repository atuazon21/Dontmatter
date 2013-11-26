package lab2;
import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value for the radius: ");
        int radius;
        radius = scan.nextInt();
        
        final double PI = 3.14159;
        
        double area1 = PI * radius * radius;
        double circumference1 = 2 * (PI * radius);
        double area2 = PI * radius * radius;
        double circumference2 = 2 * (PI * radius);
        
        System.out.println("The area of a circle with radius " + radius +
                           " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference1);
        
        radius = radius * 2;
        area1 = PI * radius * radius;
        circumference1 = 2 * (PI * radius);
        
        System.out.println("The area of a circle with radius " + radius +
                           " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference1);
        
        double newarea = area1/area2;
        double newcircumference = circumference1/circumference2;
        
        System.out.println("The area of a circle with twice the radius, increases by "
                            + "a factor of " + newarea);
        System.out.println("The circumference of a circle with twice the radius, increases by "
                + "a factor of " + newcircumference);
        
        scan.close();
        
    }
}