package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
  public WebDriver driver;
  public WebDriverWait wait;
  public WebElement element;
  
  public void esperarPaginaCarregar() {
    wait = new WebDriverWait(driver, 10);
    wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
  }
  
  
  @BeforeClass
  public static void beforeAll() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
  }
  
  @Before
  public void setup() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 120);
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
 
  }
  
  @After
  public void tearDown() {
    try {
      Thread.sleep(3000);
      driver.close();
    } catch (Exception e) {
      // TODO: handle exception

    }
  }
}
