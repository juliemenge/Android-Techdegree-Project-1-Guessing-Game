import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      //print administrator setup
      System.out.println("ADMINISTRATOR SETUP:");
      System.out.println("====================");
      
      //prompt user for what is in the jar
      Scanner scanner = new Scanner(System.in);
      System.out.printf("What type of item is in the jar? ");
      String itemName = scanner.nextLine();
      
      //prompt user for maximum number of items in the jar
      System.out.printf("What is the maximum amount of %s? ",
                      itemName);
      int MAX_ITEMS = scanner.nextInt();
      
      //create jar with random amount of items, up to maximum amount specified by player
      Jar jar = new Jar(itemName, MAX_ITEMS);
      
      System.out.println("PLAYER:");
      System.out.println("====================");
      
      //begin the game, print out the instructions for the player 
      System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: %n",
                       jar.getItemName(),
                       jar.getMaxItems()
                       );
      
      
      //store the player's guess
      int playerGuess = scanner.nextInt();
      
      //Use a while loop to prompt the user for a new guess until the correct answer is guessed
      int numberOfTries = 1;
      int itemsInJar = jar.fillJar();
      
      while (playerGuess != itemsInJar) {
        System.out.printf("Sorry, that's wrong! Guess again: ");
        playerGuess = scanner.nextInt();
        numberOfTries+=1;
      }
      
      //lets player know how many tries it took them to win
      System.out.printf("You got it in %d attempt(s)! %n",
                       numberOfTries
                       );
      }
       
    }

