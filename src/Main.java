
import postmachine.factory.PostMachine;
import postmachine.factory.PostMachineFactory;
import postmachine.factory.BarcodeMachineFactory;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class Main {
  public static void main(String[] args) {
    PostMachineFactory factory = new BarcodeMachineFactory();
    PostMachine postMachine = factory.makePostMachine();
    postMachine.on();
  }
}
