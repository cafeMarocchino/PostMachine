package postmachine.factory.parts;

import postmachine.product.ProductList;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class BarcodeScanner implements Scanner{
  @Override
  public int scan(ProductList productList){
    System.out.println("get barcode ...");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int barcode = scanner.nextInt();
    if (productList.isHave(barcode)) {
      return barcode;
    } else {
      return -1;
    }
  }
}
