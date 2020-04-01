package pages;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import uimaps.PrincipalPageMap;

public class PrincipalPage extends BasePage {
	private PrincipalPageMap principalPageMap = new PrincipalPageMap();

	public PrincipalPage(WebDriver driver) {
		super(driver);
	}

	public void selecionarMenu(String menu) {
		click(principalPageMap.getMenu(menu));
	}

	public void clickButton(String nameButton) {
		wait(principalPageMap.getMenu(nameButton));
		click(principalPageMap.getMenu(nameButton));
	}

	public void acessarUrl(String usuario, String senha) {
		driver.get(principalPageMap.getUrl(usuario, senha));
	}

	public void validarTitulo(String title) {
		wait(principalPageMap.getTitle(title));
	}

	public void isImageBroken() {
		for (WebElement image : driver.findElements(principalPageMap.getImages)) {
			if (image.getAttribute("naturalWidth").equals("0")) {
				System.out.println(image.getAttribute("outerHTML") + " is broken.");
			}
		}
	}

	public void nameButtonChanged(String button) {
		WebElement element = driver.findElement(principalPageMap.getButton(button));
		String text = element.getText();
		click(element);
		element = driver.findElement(principalPageMap.getButton(button));
		if (element.getText().equals(text))
			fail("O botão não mudou o valor");
	}

	public void rightClickBox() {
		rightClick(driver.findElement(principalPageMap.getBox));
	}

	public void checkboxClick() {
		List<WebElement> checkbox = driver.findElements(principalPageMap.getCheckbox);
		for (WebElement element : checkbox) {
			if (element.getAttribute("checked") == null) {
				element.click();
			}
		}
	}

	public void dropdownClick(String option) {
		Select dropdown = new Select(driver.findElement(principalPageMap.dropdown));
		dropdown.selectByVisibleText(option);
	}

}
