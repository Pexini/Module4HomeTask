package HomeTask.Hard;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write area of what your need calculate: (1 - rectangle, 2 - triangle, 3 - circle : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateRectangleArea();
                break;
            case 2:
                calculateTriangleArea();
                break;
            case 3:
                CalculateCircleArea();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private static void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 4 side of your rectangle : ");
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double result = length * width;
        System.out.println("Rectangle area " + result);
    }

    private static void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 length of your triangle : ");
        System.out.print("Enter length a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter length b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter length c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Triangle area " + result);

    }

    private static void CalculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius of your circle : ");
        double r = scanner.nextDouble();
        double result = Math.PI * Math.pow(r, 2);

        System.out.println("Circle Area " + result);

    }


}
