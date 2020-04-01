package uimaps;

import org.openqa.selenium.By;

public class PrincipalPageMap {

	public By getMenu(String menu) {
		return By.xpath("//*[text() = '" + menu + "']");
	}

	public String getUrl(String usuario, String senha) {
		return "https://" + usuario + ":" + senha + "@" + "the-internet.herokuapp.com/basic_auth";
	}

	public By getTitle(String title) {
		return By.xpath("//h3[text() = '" + title + "']");
	}

	public By getImages = By.xpath("//div[@class='example']//img");

	public By getButton(String button) {
		return By.xpath("//*[@class='" + button + "']");
	}

	public By getBox = By.xpath("//div[@id = 'hot-spot']");

	public By getCheckbox = By.xpath("//input[@type = 'checkbox']");

	public By dropdown = By.id("dropdown");

	public By dragAndDropA = By.xpath("//div[@id='column-a']");

	public By dragAndDropB = By.xpath("//div[@id='column-b']");
}
