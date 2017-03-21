package postmachine.factory.parts;

import postmachine.product.Product;
import postmachine.product.ProductList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class ReceiptPrinter {
  public void printReceipt(LinkedList<Integer> cartList, ProductList productList) {
    Iterator<Integer> iterator = cartList.iterator();
    System.out.println("-----------------Receipt------------------");
    while(iterator.hasNext()) {
      Product product = productList.getProduct(iterator.next());
      System.out.println("name : " + product.getName() + " price : " + product.getPrice());
    }
    iterator = cartList.iterator();
    int totalPrice = 0;
    while(iterator.hasNext()) {
      Product product = productList.getProduct(iterator.next());
      totalPrice += product.getPrice();
    }
    System.out.println("total price : " + totalPrice);
    System.out.println("-----------------Receipt------------------");
  }
}
