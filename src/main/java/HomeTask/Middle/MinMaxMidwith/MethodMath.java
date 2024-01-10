package HomeTask.Middle.MinMaxMidwith;

import java.util.Scanner;

public class MethodMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 3 numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);
        int mid = (num1 + num2 + num3) / 3;

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Mid : " + mid);
    }

}
