package HomeTask;

import java.util.Scanner;

public class MiddleTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Your number are multiples of each other ");
        } else {
            double result = num1 % num2 ;
            System.out.println("Your number are not multiples of each other " + result);
        }
    }
}
