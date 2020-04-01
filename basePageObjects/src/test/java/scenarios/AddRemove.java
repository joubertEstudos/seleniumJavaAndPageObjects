package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.PrincipalPage;

public class AddRemove extends BaseTest {
	private PrincipalPage principalPage;

	@Before
	public void beforeTest() {
		principalPage = new PrincipalPage(driver);
	}

	@Test
	public void test() {
		principalPage.navegar("https://the-internet.herokuapp.com");
		principalPage.selecionarMenu("Add/Remove Elements");
		principalPage.clickButton("Add Element");
		principalPage.clickButton("Delete");
	}
}
