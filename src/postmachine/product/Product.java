package postmachine.product;

/**
 * Created by acoustically on 17. 3. 8.
 */
public class Product {
  private int price;
  private String name;

  public Product(int price, String name) {
    this.price = price;
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
