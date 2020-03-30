package pages;

import org.openqa.selenium.WebDriver;

import maps.CartMap;

public class CartPage extends BasePage {
  public CartMap cartMap = new CartMap();
  
  public CartPage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }
  
  public double getTotalPrice() {
    return Double.parseDouble(driver.findElement(cartMap.totalPrice()).getText().trim().substring(1));
  }
  
  public void procedToCheckout() {
    driver.findElement(cartMap.procedToCheckOut()).click();
  }
}
