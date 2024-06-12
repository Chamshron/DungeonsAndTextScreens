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

    public static void exploreCave() {
        System.out.println("You enter the dark cave and discover a treasure chest! Do you:");
        System.out.println("1. Open the chest");
        System.out.println("2. Leave the cave");
        System.out.println("Enter your choice traveller:");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println();
        System.out.println();

        if (choice == 1) {
            int coin = exploreRandom();
            if(coin == 0) {
                System.out.println("Turns out the chest was a mimic.");
                System.out.println("Should have checked whether the chest was breathing!");
                System.out.println("You died!");
                System.out.println("Score: " + score);
                pause();
            } else {
                System.out.println("You find treasure! Yippee!");
                score = score + 20;
                System.out.println("Your score is now: " + score);
            }
            } else if (choice ==2 ) {
            System.out.println("You leave the cave and continue your adventure. You live another day traveller.");
            confir();
        }
        else {
            System.out.println("Traveller, you must be confused. Rest a while and try again.");
        }
        scanner.close();
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


