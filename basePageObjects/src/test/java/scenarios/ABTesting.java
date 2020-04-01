package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.PrincipalPage;

public class ABTesting extends BaseTest {
	private PrincipalPage principalPage;

	@Before
	public void beforeTest() {
		principalPage = new PrincipalPage(driver);
	}

	@Test
	public void test() {
		principalPage.navegar("https://the-internet.herokuapp.com");
		principalPage.selecionarMenu("A/B Testing");
	}

}
