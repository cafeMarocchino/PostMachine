package postmachine.factory.parts;

import java.util.Scanner;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class Keyboard {
  public int keyDown(){
    java.util.Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
