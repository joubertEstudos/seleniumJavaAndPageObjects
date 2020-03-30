package pages;

import org.openqa.selenium.WebDriver;

import maps.IndexMap;

//http://automationpractice.com/index.php


public class IndexPage extends BasePage {
  public IndexMap indexMap;
  
  
  public IndexPage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
    indexMap = new IndexMap();
  }

  public void search(String search) {
    
    driver.findElement(indexMap.getSearchBox()).sendKeys(search);
    click(driver.findElement(indexMap.getSearchButton()));
  }


}
