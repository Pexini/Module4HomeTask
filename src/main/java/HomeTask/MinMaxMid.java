package HomeTask;

import java.util.Scanner;

public class MinMaxMid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 3 numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min, max, mid;
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        mid = (num1 + num2 + num3) / 3;
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        System.out.println("Average: " + mid);
    }


}
