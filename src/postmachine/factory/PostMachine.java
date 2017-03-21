package postmachine.factory;
import postmachine.product.ProductList;
import postmachine.factory.parts.*;

import java.util.LinkedList;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class PostMachine {
  private Scanner scanner;
  private Keyboard keyboard;
  private Moniter moniter;
  private ReceiptPrinter receiptPrinter;
  private CardReader cardReader;
  private LinkedList<Integer> cartList;
  private ProductList productList = new ProductList();
  PostMachine(
    Scanner scanner
    , Keyboard keyboard
    , Moniter moniter
    , ReceiptPrinter receiptPrinter
    , CardReader cardReader
  ) {
    this.scanner = scanner;
    this.keyboard = keyboard;
    this.moniter = moniter;
    this.receiptPrinter = receiptPrinter;
    this.cardReader = cardReader;
    this.cartList = new LinkedList<>();
  }
  public void on() {
    while(true) {
      System.out.println("barcode scan : 1 ");
      System.out.println("pay : 2");
      System.out.println("off : 3");
      int key = keyboard.keyDown();
      if (key == 1) {
        addProduct();
      } else if(key == 2) {
        pay();
      } else if(key == 3) {
        return;
      }
    }
  }
  private void addProduct() {
    int barcode = scanner.scan(productList);
    if(barcode == -1) {
      System.out.println("this product is have not in the machine");
      return;
    } else {
      cartList.add(barcode);
      moniter.showList(cartList, productList);
    }
  }
  private void pay() {
    if(cardReader.readCard()) {
      receiptPrinter.printReceipt(cartList, productList);
      cartList.clear();
    } else {
      System.out.println("Cannot be read card");
    }
  }
}
