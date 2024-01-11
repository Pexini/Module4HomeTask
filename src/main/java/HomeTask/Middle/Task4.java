package HomeTask.Middle;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write what do you want on breakfast we have Eggs, Coffee, Milk  :");
        String breakfast = scanner.next();
        if (breakfast.contains("Eggs") && breakfast.contains("Coffee") && breakfast.contains("Milk")) {
            System.out.println("You can cook omelette and coffee");
        } else if (breakfast.contains("Eggs") && breakfast.contains("Coffee")) {
            System.out.println("You can cook fried eggs and coffee");
        } else if (breakfast.contains("Eggs")) {
            System.out.println("You can cook fried eggs");
        } else {
            System.out.println("Invalid input");
        }
    }
}


