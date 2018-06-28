package cl.mjstore.testcase;

import org.testng.annotations.Test;
import cl.mjstore.configuracion.TestBase;
import cl.mjstore.dataProviders.IntegratedDataProvider;
import cl.mjstore.home.page.pageLlenacarro;
import cl.mjstore.home.page.pageLlenadire;
import cl.mjstore.home.page.pageLogin;

public class Test01 extends TestBase  {
		private pageLogin login;
		private pageLlenacarro llenacarro;
		private pageLlenadire llenadirec;
		//WebElement btonCarro;
	
  @Test(dataProvider = "UsuarioNormal", dataProviderClass = IntegratedDataProvider.class )
  public void IniciaSesion(cl.mjstore.home.page.user user)throws Exception {
	  login = new pageLogin(driver);
	  llenadirec = new pageLlenadire(driver);
	  
	  login.linkSesion();	
	  login.ingresoSesion(user.getUsername(), user.getPassword());
	  login.linkdireccion(); 
	  llenadirec.llenaDireccion("Juan", "Perez", "alamada 291", "santiago", "chile", "961919710");
 	  
	  llenacarro = new pageLlenacarro(driver);
	  llenacarro.menuBasico();
	  llenacarro.anadeCarro();
	  llenacarro.menuProf();
	  llenacarro.anadeCarro3();
	  llenacarro.mouseOver();
	  llenacarro.clicconfirmacarro();
  }
 
    

}
