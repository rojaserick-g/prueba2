package cl.mjstore.dataProviders;


import org.testng.annotations.DataProvider;
//import com.Entities.User;
import com.google.gson.Gson;

import cl.mjstore.home.page.User;

public class IntegratedDataProvider {
	
	
	@DataProvider
	  public static Object[][] UsuarioNormal() {
	    Gson gson = new Gson();
	    User user = gson.fromJson(String.format("src/main/resources/json/user.json"),
	            User.class);
	    return new Object[][] {{user}};
	  }
}
