package cl.mjstore.orden.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageOrden {
WebDriver driver;

//Constructor
public pageOrden(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

//identificar objetos ventana resumen
@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
private WebElement btnircaja; //btn ir a caja en ventana resumen
//identifica objetos direccion



}
