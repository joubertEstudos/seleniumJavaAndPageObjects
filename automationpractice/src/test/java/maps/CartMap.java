package maps;

import org.openqa.selenium.By;

public class CartMap {
  public By totalPrice() {
    return By.xpath("//span[@id=\"total_price\"]");
  }
  
  public By procedToCheckOut() {
    return By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
  }
}
