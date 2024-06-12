import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int health = 100;
    public static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Dungeons And Text Screens!");
        System.out.println();
        System.out.println();
        startGame();
        clear();
    }
    public static void confir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start the game");
        System.out.println("2. End the game");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        if(choice == 1) {
            startGame();
        } else {
            System.out.println();
            System.out.println("Game Over");
            System.out.println("Your Health Score: " + health   );
            System.out.println("Your Final Score: " + score );
        }
        pause();
        clear();
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
    public static int exploreRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        return randomNumber;
    }

    public static void enterForest() {
        System.out.println("You walk through the enchanted forest and encounter a dangerous creature!");
        System.out.println("1. Fight with the creature");
        System.out.println("2. Flee deeper into the forest");
        System.out.println("Enter your choice");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        clear();
        if(choice == 1){
            int num = exploreRandom();
            if(num == 0){
                System.out.println("The creature disarms you and devours you!");
                System.out.println("You have died");
                System.out.println("Your total score:" + score  );
                pause();
            } else {
                System.out.println("You disarm the beast and win the battle!");
                score = score + 20;
                System.out.println("Your score: " + score);
                System.out.println("You leave the forest!");
                pause();
                clear();
                confir();
            }
        } else if (choice == 2) {
            System.out.println("You flee deeper into the forest and get lost");
            confir();
        } else {
            System.out.println("Traveller, you must be confused. Rest a while and try again.");
        }
        scanner.close();
    }

    public static void pause() {
        Scanner scan = new Scanner(System.in);
        scan.next();
    }

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}


