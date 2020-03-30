package maps;

import org.openqa.selenium.By;

public class IndexMap {
  
  //Search //*[@id="search_query_top"]
  
  public By getSearchBox() {
    return By.xpath("//input[@id='search_query_top']");
  }
  
  public By getSearchButton() {
    return By.xpath("//button[@class='btn btn-default button-search']");
  }
  
 
}
