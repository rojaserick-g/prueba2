package cl.mjstore.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLogin {

	private pageLlenacarro menubasico;
	WebDriver driver;
	
	//constructor
	public pageLogin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//IdentificarObjetos
	@FindBy(xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[6]/div/a")
	private WebElement linkSesion;
	@FindBy(id = "email")
	private WebElement txtemail;
	@FindBy(id = "passwd")
	private WebElement txtpass;
	@FindBy(id ="SubmitLogin")
	private WebElement btnInicia;
	@FindBy(linkText = "Añadir mi primera dirección")
	private WebElement btndirec;
	
	//MetodoLinksesion
	public void linkSesion() throws InterruptedException {
		linkSesion.click();
		Thread.sleep(2000);
	}
	public String ingresoSesion(String user, String pass) throws InterruptedException{
		String msg = "OK";
		if(txtemail.isDisplayed()) {
			txtemail.isSelected();
			txtemail.clear();
			txtemail.sendKeys(user);
		}	
		if(txtpass.isDisplayed()) {
			txtpass.isSelected();
			txtpass.clear();
			txtpass.sendKeys(pass);
		}
		if(btnInicia.isDisplayed()) {
			btnInicia.click();
			Thread.sleep(500);
		}
		
		return msg;
		}
	public void linkdireccion() throws Exception {
		btndirec.click();
		Thread.sleep(2000);
	}
	
	
}
