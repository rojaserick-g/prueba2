package cl.mjstore.configuracion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class TestBase {

	protected static WebDriver driver;
	public String baseURL;
	public static String curdir = System.getProperty("user.dir");
	
 @BeforeClass	
	public void setUp() throws Exception{
		System.out.println("Levantando Navegador");
		System.setProperty("webdriver.chrome.driver", curdir + "\\src\\main\\resources\\driver\\chromedriver.exe");
		driver =  new ChromeDriver ();
		baseURL= "http://www.mjstore.cl";	
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
 @AfterClass
 public void tearDown() throws Exception {
	  driver.quit();
	  Thread.sleep(3000);
 }
	}
