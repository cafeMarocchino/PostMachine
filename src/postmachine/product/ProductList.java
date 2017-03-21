package postmachine.product;


import java.util.HashMap;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class ProductList {
  private HashMap<Integer, Product> hashMap = new HashMap<>();
  public ProductList() {
    hashMap.put(1, new Product(1300, "Coca-Cola"));
    hashMap.put(2, new Product(1000, "Pepsi"));
    hashMap.put(3, new Product(1200, "Cider"));
    hashMap.put(4, new Product(1000, "Fanta"));
    hashMap.put(5, new Product(900, "OranC"));
  }
  public Product getProduct(int barcode){
    return hashMap.get(barcode);
  }
  public boolean isHave(int barcode) {
    return hashMap.containsKey(barcode);
  }
}
