package scenarios;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pages.CartPage;
import pages.IndexPage;
import pages.SearchPage;

public class AbrirSite extends BaseTest {
  IndexPage indexPage;
  SearchPage searchPage;
  CartPage cartPage;
  ArrayList<String> tabs_windows;
  
  @Before
  public void beforetest() {
    indexPage = new IndexPage(this.driver);
    searchPage = new SearchPage(this.driver);
    cartPage = new CartPage(this.driver);
  }
  
  @Test
  public void test() throws Exception {
    driver.navigate().to("http://automationpractice.com/index.php");
    esperarPaginaCarregar();
    indexPage.search("dress");
    esperarPaginaCarregar();
    searchPage.addItensLowerThen(searchPage.getDivs(), 30);
    //    searchPage.AddAllItensToCart(searchPage.getDivs());
    esperarPaginaCarregar();  
    searchPage.checkoutCar();
    esperarPaginaCarregar();
    cartPage.checkoutMAX(2000);
  }
  
  @After
  public void after() throws Exception {
    driver.close();
  }
}
