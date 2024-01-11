package HomeTask.Middle;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write what do you want on breakfast we have Eggs, Coffee, Milk  :");
        String breakfast = scanner.next();
        boolean hasEggs = breakfast.contains("Eggs");
        boolean hasCoffee = breakfast.contains("Coffee");
        boolean hasMilk = breakfast.contains("Milk");

        if (hasEggs && hasCoffee && hasMilk) {
            System.out.println("You can cook omelette and coffee");}
        if (hasEggs && hasCoffee) {
            System.out.println("You can cook fried eggs and coffee");}
        if (breakfast.contains("Eggs")) {
            System.out.println("You can cook fried eggs");}
        if (!hasEggs && !hasCoffee && !hasMilk)
            System.out.println("Invalid input");
        }
    }



