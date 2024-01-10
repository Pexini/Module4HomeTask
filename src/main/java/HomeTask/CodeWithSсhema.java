package HomeTask;

import java.util.Scanner;

public class CodeWithSсhema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value X :");
        int x = scanner.nextInt();
        int y;
        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }
        System.out.println(" Your result ; " + y);
    }
}
