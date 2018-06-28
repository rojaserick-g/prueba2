package cl.mjstore.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLlenadire {
WebDriver driver;
//constructor
public pageLlenadire(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

//identifica elementos 
@FindBy(id = "firstname")
private WebElement txtnombre;
@FindBy(id = "lastname")
private WebElement txtapell;
@FindBy(id = "address1")
private WebElement txtdirec;
@FindBy(id = "city")
private WebElement txtciudad;
@FindBy(id = "id_country")
private WebElement combopais;
@FindBy(id = "phone_mobile")
private WebElement txtmobile;
@FindBy(id = "submitAddress")
private WebElement btnguardar;

public String llenaDireccion(String nombre, String apellido, String direccion, String ciudad, String pais, String fono)throws InterruptedException {
	String msg = "OK";
	if(txtnombre.isDisplayed()) {
		txtnombre.isSelected();
		txtnombre.clear();
		txtnombre.sendKeys(nombre);
	}
	if(txtapell.isDisplayed()) {
		txtapell.isSelected();
		txtapell.clear();
		txtapell.sendKeys(apellido);
	}
	if(txtdirec.isDisplayed()) {
		txtdirec.isSelected();
		txtdirec.clear();
		txtdirec.sendKeys(direccion);
	}
	if(txtciudad.isDisplayed()) {
		txtciudad.isSelected();
		txtciudad.clear();
		txtciudad.sendKeys(ciudad);
	}
	if(combopais.isDisplayed()) {
		combopais.isSelected();
		combopais.sendKeys(pais);
	}
	if(txtmobile.isDisplayed()) {
		txtmobile.isSelected();
		txtmobile.clear();
		txtmobile.sendKeys(fono);
	}
	if(btnguardar.isDisplayed()) {
		btnguardar.click();
		Thread.sleep(2000);
	}
	
	return msg;
}
}


