package cl.mjstore.testcase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cl.mjstore.classJson.CreaCuenta;
import cl.mjstore.configuracion.TestBase;
import cl.mjstore.home.page.MetodosReutilizables;
import cl.mjstore.home.page.pageCreaCuenta;
import cl.mjstore.home.page.pageLogin;

public class Test02 extends TestBase {
    private pageLogin login;
    private pageCreaCuenta creacuenta;
    public static String curDir = System.getProperty("user.dir");
     
    WebDriver driver;
    MetodosReutilizables mr = new MetodosReutilizables();//instancia clase metodos reutilizables
	String nombreClase = getClass().getSimpleName();
	String nombreCarpeta = "ReporteResultados";

	  ExtentReports report = new ExtentReports(curDir + "\\" + nombreCarpeta + "\\" + nombreClase + "\\WebTC01.html");
	  ExtentTest logger;
	
    @Test(dataProvider = "getData")
    public void testMethod(CreaCuenta data) throws Exception {
    	
  	  creacuenta = new pageCreaCuenta(driver);
  	  login = new pageLogin(driver);
  	  
  	  login.linkSesion();
  	  creacuenta.creaCuenta(data.getCreacuenta());
  	  
  	 //generaReporte
	  logger = report.startTest("Test web mjstore.cl");
	  logger.log(LogStatus.INFO, "usuario crea nuevo cliente");
	  logger.log(LogStatus.INFO, logger.addScreenCapture("pathEvidencia_Login"));
	  logger.log(LogStatus.PASS, "Se crea cuenta");
	  report.endTest(logger);
	  report.flush();
    }
    
    @DataProvider
    public Object[][] getData() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/main/resources/json/creacuenta.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataSet");
        List<CreaCuenta> CreaCuenta = new Gson().fromJson(dataSet, new TypeToken<List<CreaCuenta>>() {
        }.getType());
        Object[][] returnValue = new Object[CreaCuenta.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = CreaCuenta.get(index++);
        }
        return returnValue;
    }
}
