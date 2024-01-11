package HomeTask.Middle;

import java.util.Scanner;

public class Task4Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write what do you want on breakfast we have Eggs, Coffee, Milk  :");
        String breakfast = scanner.next();

        boolean Eggs = breakfast.contains("Eggs");
        boolean Coffee = breakfast.contains("Coffee");
        boolean Milk = breakfast.contains("Milk");

        String result;

        switch (breakfast) {
            case "Eggs":
                result = "You can cook fried eggs";
                break;
            case "Eggs Coffee":
                result = "You can cook fried eggs and coffee";
                break;
            case "Eggs Coffee Milk":
                result = "You can cook omelette and coffee";
                break;
            default:
                result = "Invalid input";
        }
        System.out.println(result);
    }
}
