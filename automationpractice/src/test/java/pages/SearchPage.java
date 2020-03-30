package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maps.SearchMap;

public class SearchPage extends BasePage {
  public SearchMap searchMap = new SearchMap();
  public JavascriptExecutor js = (JavascriptExecutor) driver;
  
  public SearchPage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }
  
  public List<WebElement> getDivs() {
    List<WebElement> listOfElements = driver.findElements(searchMap.divs());
    System.out.println(listOfElements.size());
    return listOfElements;
  }
  
  public void AddAllItensToCart(List<WebElement> listOfWebElements) throws InterruptedException {
    for (WebElement webElement : listOfWebElements) {
      js.executeScript("arguments[0].scrollIntoView(true);", webElement);
      webElement.findElement(searchMap.addToCart()).click();
      webElement.findElement(searchMap.continueShopping()).click();
      Thread.sleep(1000);
    }
  }
  
  public void addItensLowerThen(List<WebElement> listOfWebElements, double desiredPrice) throws InterruptedException {
    for (WebElement webElement : listOfWebElements) {
      js.executeScript("arguments[0].scrollIntoView(true);", webElement);
      double price = Double.parseDouble(webElement.findElements(searchMap.getPrice()).get(1).getText().substring(1));
      if (price <= desiredPrice) {
        js.executeScript("arguments[0].click();", webElement.findElement(searchMap.addToCart()));
        webElement.findElement(searchMap.continueShopping()).click();
        Thread.sleep(1000);
      }
    }
  }
  
  public void checkoutCar() {
    driver.findElement(searchMap.cart()).click();
    // Thread.sleep(10000);
  }
}
