package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.PrincipalPage;

public class Autenticacao extends BaseTest {

	private PrincipalPage principalpage;

	@Before
	public void beforetest() {
		principalpage = new PrincipalPage(driver);
	}

	@Test
	public void test() throws Exception {
		principalpage.navegar("https://the-internet.herokuapp.com/");
		principalpage.acessarUrl("admin", "admin");
		principalpage.validarTitulo("Basic Auth");
	}
}
