package HomeTask.Hard;

public class Task2 {
    public static void main(String[] args) {
        char elephantX = 'C';
        char elephantY = '1';
        char pawnX = 'G';
        char pawnY = '1';

        int xDifference = Math.abs(elephantX - pawnX);
        int yDifference = Math.abs(elephantY - pawnY);

        if (xDifference == yDifference) {
            System.out.println("Yes, your pawn is under attack");
        } else {
            System.out.println("No, your pawn is not under attack");
        }
    }
}
