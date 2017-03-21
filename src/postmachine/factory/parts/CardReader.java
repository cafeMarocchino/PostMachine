package postmachine.factory.parts;

import java.util.Scanner;

/**
 * Created by acoustically on 17. 3. 8.
  */
public class CardReader {
  public boolean readCard() {
    System.out.println("read card ...");
    java.util.Scanner scanner = new Scanner(System.in);
    String cardNumber = scanner.nextLine();
    return someFunction(cardNumber);
  }
  private boolean someFunction(String cardNumber) {
    // some function develope in this method
    return true;
  }
}
