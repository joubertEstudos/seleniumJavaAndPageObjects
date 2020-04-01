package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
	}

	@Before
	public void before() {
		driver = new ChromeDriver();
	}

	@After
	public void after() {
		try {
//      Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
