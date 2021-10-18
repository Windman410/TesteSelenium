package stepsDefinitions;

import static utils.Utils.espera;

import org.junit.Assert;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.InsurantDataPage;
import pageObjects.PriceOptionQuotePage;
import pageObjects.ProductDataPage;
import pageObjects.VehicleDataPage;

public class BaseSteps {
	VehicleDataPage vp = new VehicleDataPage();
	InsurantDataPage ip = new InsurantDataPage();
	ProductDataPage pp = new ProductDataPage();
	PriceOptionQuotePage poqp = new PriceOptionQuotePage();
	BasePage bp = new BasePage();

	@Quando("eu clicar na aba {string}")
	public void euClicarNaAba(String aba) {
		bp.clicarAba(aba).click();
	}
	
	@Quando("eu apertar o botao next")
	public void euApertarOBotaoNext() throws InterruptedException {
		if(vp.buttonNext().isDisplayed()) {
			vp.buttonNext().click();
		}else if(ip.buttonNext().isDisplayed()) {
			ip.buttonNext().click();
		}else if(pp.buttonNext().isDisplayed()) {
			 pp.buttonNext().click();
		}else if(poqp.buttonNext().isDisplayed()) {
			poqp.buttonNext().click();
		}else {
			Assert.fail("Nenhum botao next encontrado");
		}
		Thread.sleep(espera);
	}	
	
	@Entao("aparece a mensagem {string}")
	public void apareceAMensagem(String mensagem) throws InterruptedException {
		Thread.sleep(15000);
		Assert.assertTrue(bp.mensagemSucesso(mensagem).isDisplayed()); 
	}
}
