package postmachine.factory;

import postmachine.factory.parts.*;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class BarcodeMachineFactory implements PostMachineFactory {
  @Override
  public PostMachine makePostMachine() {
    return new PostMachine(new BarcodeScanner(), new Keyboard(), new Moniter(), new ReceiptPrinter(), new CardReader());
  }
}
