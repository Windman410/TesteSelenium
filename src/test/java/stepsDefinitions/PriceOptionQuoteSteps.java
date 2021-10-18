package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObjects.PriceOptionQuotePage;
import pageObjects.InsurantDataPage;
import pageObjects.ProductDataPage;
import pageObjects.VehicleDataPage;
import static utils.Utils.espera; 

public class PriceOptionQuoteSteps {
	PriceOptionQuotePage p = new PriceOptionQuotePage();
	
	@Quando("eu selecionar o radio {string} no campo Price Option")
	public void euSelecionarORadioNoCampoPriceOption(String price) throws InterruptedException {
		p.radioPriceOption(price).click();
		Thread.sleep(3000);
	}
	
	@Quando("eu digitar no campo Email {string}")
	public void euDigitarNoCampoEmail(String email) throws InterruptedException {
		p.inputEmail().sendKeys(email);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Phone {string}")
	public void euDigitarNoCampoPhone(String phone) throws InterruptedException {
		p.inputPhone().sendKeys(phone);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Username {string}")
	public void euDigitarNoCampoUsername(String username) throws InterruptedException {
		p.inputUsername().sendKeys(username);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Password {string}")
	public void euDigitarNoCampoPassword(String password) throws InterruptedException {
		p.inputPassword().sendKeys(password);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Confirm Password {string}")
	public void euDigitarNoCampoConfirmPassword(String password) throws InterruptedException {
		p.inputConfirmPassword().sendKeys(password);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Comments {string}")
	public void euDigitarNoCampoComments(String comment) throws InterruptedException {
		p.inputComments().sendKeys(comment);
		Thread.sleep(espera);
	}
	
	@Quando("eu apertar o botao send")
	public void euApertarOBotaoSend() throws InterruptedException {
		p.buttonSend().click();
		Thread.sleep(espera);
	}
	
}
