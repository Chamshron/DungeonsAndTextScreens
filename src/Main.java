import java.util.Scanner;

public class Main {
    public static int health = 100;
    //    Health variable to calculate health or int damage
    public static int score = 0;


    public static void main(String[] args) {
        System.out.println("Welcome To Dungeons And Text Screens!");
        System.out.println();
        System.out.println();
        startGame();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You find yourself in a strange place, do you:");
        System.out.println("1. Explore the dark cave ahead of you");
        System.out.println("2. Turn right and walk through the enchanted forest");
        System.out.println();
        System.out.println("Enter your choice traveller:");

        int choice = scanner.nextInt();
        System.out.println();

        clear();
        if (choice == 1) {
            exploreCave();
        } else if (choice == 2){
            enterForest();
        } else {
            System.out.println("Traveller, you must be confused. Rest a while and try again.");
        }
        clear();
        scanner.close();
    }
}


