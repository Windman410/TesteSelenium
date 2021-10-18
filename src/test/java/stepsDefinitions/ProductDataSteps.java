package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PriceOptionQuotePage;
import pageObjects.ProductDataPage;

import static utils.Utils.espera; 
public class ProductDataSteps {
	ProductDataPage vd = new ProductDataPage();
	PriceOptionQuotePage bp = new PriceOptionQuotePage();
	
	@Quando("eu digitar no campo Start Date {string}")
	public void euDigitarNoCampoStartDate(String date) throws InterruptedException {
		vd.inputStartDate().sendKeys(date);
		Thread.sleep(espera);

	}
	
	@Quando("eu selecionar no campo Insurance Sum a opcao {string}")
	public void euSelecionarNoCampoInsuranceSumAOpcao(String sum) throws InterruptedException {
		vd.selectInsuranceSum().click();
		Thread.sleep(espera);
		vd.selectInsuranceSumOption(sum).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar no campo Merit Rating a opcao {string}")
	public void euSelecionarNoCampoMeritRatingAOpcao(String rating) throws InterruptedException {
		vd.selectMeritRating().click();
		Thread.sleep(espera);
		vd.selectMeritRatingOption(rating).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar no campo Damage Insurance a opcao {string}")
	public void euSelecionarNoCampoDamageInsuranceAOpcao(String damage) throws InterruptedException {
		vd.selectDamageInsurance().click();
		Thread.sleep(espera);
		vd.selectDamageInsuranceOption(damage).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar os checkbox no campo Optional Products")
	public void euSelecionarOsCheckboxNoCampoOptionalProducts(io.cucumber.datatable.DataTable products) throws InterruptedException {
		vd.checkboxOptional(products);
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar no campo Courtesy Car a opcao {string}")
	public void euSelecionarNoCampoCourtesyCarAOpcao(String car) throws InterruptedException {
		vd.selectCourtesyCar().click();
		Thread.sleep(espera);
		vd.selectCourtesyCarOption(car).click();
		Thread.sleep(espera);
	}

}
