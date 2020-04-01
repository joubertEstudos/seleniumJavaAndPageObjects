package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriverWait wait;
	public WebDriver driver;
	public Actions action;
	public JavascriptExecutor js = (JavascriptExecutor) driver;

	public BasePage(WebDriver driver) {
		this.action = new Actions(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void wait(By element) {
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public void rightClick(WebElement element) {
		action.contextClick(element).perform();
	}

	public void confirmAlert() {
		driver.switchTo().alert().accept();
	}

	public void scroll(WebElement webElement) {
		js.executeScript("arguments[0].scrollIntoView(true);", webElement);
	}

	public void jsClick(WebElement webElement) {
		js.executeScript("arguments[0].click();", webElement);

	}

}