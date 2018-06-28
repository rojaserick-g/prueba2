package cl.mjstore.home.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLlenacarro {

	WebDriver driver;
	
	//Constructor
	public pageLlenacarro(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement menuBasico;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]")
	private WebElement btnAnadirCarro; //añade syma x5sw
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement btnSigueCompra;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div/div[3]/div/div[2]/a[1]")
	private WebElement btnAnadirCarro2; //añade syma x8wh
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement btonSigueCompra2;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement menuProf;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]")
	private WebElement btnAnadircarro3;//añade voyager4
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement btnSigueCompra3;
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[3]/div/a/span[3]")
	private WebElement btonCarro; //se_posiciona_sobre_boton_y_despliega_listado_de_productos
	@FindBy(xpath = "//*[@id=\"button_order_cart\"]")
	private WebElement btnconfirma; //boton confirma carro de compra
	
	public void menuBasico () throws InterruptedException{
		menuBasico.click();
		Thread.sleep(2000);
	}
	public void anadeCarro()throws InterruptedException{
		if(btnAnadirCarro.isDisplayed()) {
			btnAnadirCarro.click();
			Thread.sleep(2000);
		}
		if(btnSigueCompra.isDisplayed()) {
			btnSigueCompra.click();
			Thread.sleep(2000);
		}
		if(btnAnadirCarro2.isDisplayed()) {
			btnAnadirCarro2.click();
			Thread.sleep(2000);
		}
		if(btonSigueCompra2.isDisplayed()) {
			btonSigueCompra2.click();
			Thread.sleep(2000);
		}
	}
	public void menuProf()throws InterruptedException{
		menuProf.click();
		Thread.sleep(2000);
	}
	public void anadeCarro3()throws InterruptedException{
		if(btnAnadircarro3.isDisplayed()) {
			btnAnadircarro3.click();
			Thread.sleep(2000);
		}
		if(btnSigueCompra3.isDisplayed()) {
			btnSigueCompra3.click();
			Thread.sleep(2000);
		}
	}
	public void mouseOver() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[3]/div/a"));
		action.moveToElement(element).build().perform();
		Thread.sleep(4000);
	}
	public void clicconfirmacarro()throws Exception{
		if(btnconfirma.isDisplayed()) {
			btnconfirma.click();
			Thread.sleep(5000);
		}
	}
}
