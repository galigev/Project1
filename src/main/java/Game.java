import java.io.Console;

public class Game {
    public static void main(String[] args) {
      Console console = System.console();
      System.out.printf("What is the name of the item you want?  ");
      String itemName = console.readLine();
      System.out.printf("What is the maximum nubmer of %s?  ", itemName);
      int itemNumber = Integer.parseInt(console.readLine());
      
      Jar jar = new Jar(itemName, itemNumber);
      int filledNumber = jar.fill();
      
      int playerNumber, numberOfGuess = 1;
      System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.  ", itemName, itemNumber);
      playerNumber = Integer.parseInt(console.readLine());
      
      while(playerNumber != filledNumber){
        System.out.printf("No... Guess again, Pick a number between 1 and %d.  ", itemNumber);
        playerNumber = Integer.parseInt(console.readLine());
        numberOfGuess++;
      }
      
      System.out.printf("Congrads!! You got it in %d attempt(s)", numberOfGuess);
    }
}
