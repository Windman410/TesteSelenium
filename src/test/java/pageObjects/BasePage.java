package pageObjects;

import static utils.Utils.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav_automobile")
	private WebElement abaAutomobile;
	
	@FindBy(id = "nav_truck")
	private WebElement abaTruck;
	
	@FindBy(id = "nav_motorcycle")
	private WebElement abaMotorcycle;

	@FindBy(id = "nav_camper")
	private WebElement abaCamper;

	@FindBy(xpath = "//*[text()='Sending e-mail success!']")
	private WebElement mensagemSucesso;
	
	public WebElement clicarAba(String aba) {		
		if(aba.equals("Automobile")) {	
			if(abaAutomobile.isDisplayed()) {
				return abaAutomobile;
			} else {
				Assert.fail("Aba Automobile nao encontrada");
				return null;
			}	
		} else if(aba.equals("Truck")) {
			if(abaTruck.isDisplayed()) {
				return abaTruck;
			} else {
				Assert.fail("Aba Truck nao encontrada");
				return null;
			}	
		}else if(aba.equals("Motorcycle")) {
			if(abaMotorcycle.isDisplayed()) {
				return abaMotorcycle;
			} else {
				Assert.fail("Aba Motorcycle nao encontrada");
				return null;
			}	
		}else if(aba.equals("Camper")) {	
			if(abaCamper.isDisplayed()) {
				return abaCamper;
			} else {
				Assert.fail("Aba Camper nao encontrada");
				return null;
			}	
		}else {
			Assert.fail("Aba invalida selecionada");
			return null;
		}
	}

	public WebElement mensagemSucesso(String mensagem) {
		if(mensagemSucesso.isDisplayed()) {
			return mensagemSucesso;
		}else {
			Assert.fail("Mensagem de sucesso nao encontrada");
			return null;
		}
		
	}
}
