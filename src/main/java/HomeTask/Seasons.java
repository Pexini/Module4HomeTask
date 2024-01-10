package HomeTask;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number from 1 to 4 :");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Winter");
        } else if (num == 2) {
            System.out.println("Spring");
        } else if (num == 3) {
            System.out.println("Summer");
        } else if (num == 4) {
            System.out.println("Fall");
        }else {
            System.out.println("Wrong number");
    }
}
}
