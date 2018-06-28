package cl.mjstore.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageCreaCuenta {
	WebDriver driver;
	
	//constructor
	public pageCreaCuenta(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Identificar los elementos 
	@FindBy(id = "email_create")
	private WebElement txtcreacuenta;
	@FindBy(id = "SubmitCreate")
	private WebElement btncreacuenta;
	
	
	public String creaCuenta (String email) throws InterruptedException {
		String msg = "OK";
		if(txtcreacuenta.isDisplayed()) {
			txtcreacuenta.isSelected();
			txtcreacuenta.clear();
			txtcreacuenta.sendKeys(email);			
		}
		if(btncreacuenta.isDisplayed()) {
			btncreacuenta.click();
			Thread.sleep(2000);
		}
		
		
		return msg;
		
	}
	

}
