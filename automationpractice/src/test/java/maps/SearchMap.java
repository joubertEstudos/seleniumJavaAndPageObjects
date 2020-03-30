package maps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchMap {
  public By divs() {
    return By.xpath("//div[@class='product-container']");
  }
  
  public By getPrice() {
    return By.xpath(".//span[@itemprop='price']");
  }
  
  public By getNomeProduto() {
    return By.xpath(".//a[@class='product-name']");
  }
  
  public By getCorProduto() {
    return By.xpath(".//a[@class='color_pick']");
  }
  
  public By addToCart() {
    return By.xpath(".//a[@title='Add to cart']");
  }
    
  public By cart() {
    return By.xpath("//a[@title='View my shopping cart']");
  }
  
  public By continueShopping() {
    return By.xpath("//span[@title='Continue shopping']");
  }
}
