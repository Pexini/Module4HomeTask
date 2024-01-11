package HomeTask.Middle;

import java.util.Scanner;

public class MiddleTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 side of triangle : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println( "Sorry triangle is not real");
        }else {
            System.out.println("Yes, triangle is real");
        }
    }
}
