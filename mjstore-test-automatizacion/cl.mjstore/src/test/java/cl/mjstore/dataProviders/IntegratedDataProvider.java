package cl.mjstore.dataProviders;


import org.testng.annotations.DataProvider;
//import com.Entities.User;
import com.google.gson.Gson;

import cl.mjstore.home.page.user;


public class IntegratedDataProvider {
	
	
	@DataProvider
	  public static Object[][] UsuarioNormal() {
	    Gson gson = new Gson();
	    user user = gson.fromJson(String.format("src/main/resources/json/user.json"),
	            user.class);
	    return new Object[][] {{user}};
	  }
}
