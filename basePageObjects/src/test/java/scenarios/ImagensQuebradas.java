package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.PrincipalPage;

public class ImagensQuebradas extends BaseTest {
	private PrincipalPage principalpage;

	@Before
	public void beforeTest() {
		principalpage = new PrincipalPage(driver);
	}

	@Test
	public void test() throws Exception {
		principalpage.navegar("https://the-internet.herokuapp.com/");
		principalpage.selecionarMenu("Broken Images");
		principalpage.isImageBroken();
	}
}
