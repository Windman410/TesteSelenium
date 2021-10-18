package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObjects.PriceOptionQuotePage;
import pageObjects.VehicleDataPage;

import static utils.Utils.espera; 
public class VehicleDataSteps {
	VehicleDataPage vd = new VehicleDataPage();
	PriceOptionQuotePage bp = new PriceOptionQuotePage();
	
	@Quando("eu selecionar no campo Make a opcao {string}")
	public void euSelecionarNoCampoMakeAOpcao(String make) throws InterruptedException {
		vd.selectMake().click();
		Thread.sleep(espera);
		vd.selectMakeOptions(make).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Engine Performance {string}")
	public void euDigitarNoCampoEnginePerformance(String engine) throws InterruptedException {
		vd.inputEnginePerformance().sendKeys(engine);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Date of Manufacture {string}")
	public void euDigitarNoCampoDateOfManufacture(String date) throws InterruptedException {
		vd.inputDateOfManufacture().sendKeys(date);
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar no campo Number of Seats a opcao {string}")
	public void euSelecionarNoCampoNumberOfSeatsAOpcao(String seats) throws InterruptedException {
		vd.selectNumberOfSeats().click();
		Thread.sleep(espera);
		vd.selectNumberOfSeatsOptions(seats).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar o radio {string} no campo Right Hand Drive")
	public void euSelecionarORadioNoCampoRightHandDrive(String option) throws InterruptedException {
		vd.radioRightHandDriver(option).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu selecionar no campo Fuel a opcao {string}")
	public void euSelecionarNoCampoFuelAOpcao(String fuel) throws InterruptedException {
		vd.selectFuel().click();
		Thread.sleep(espera);
		vd.selectFuelOptions(fuel).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo List Price {string}")
	public void euDigitarNoCampoListPrice(String price) throws InterruptedException {
		vd.inputListPrice().sendKeys(price);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo License Plate Number {string}")
	public void euDigitarNoCampoLicensePlateNumber(String plate) throws InterruptedException {
		vd.inputLicensePlateNumber().sendKeys(plate);
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Annual Mileage {string}")
	public void euDigitarNoCampoAnnualMileage(String mileage) throws InterruptedException {
		vd.inputAnnualMileage().sendKeys(mileage);
		Thread.sleep(espera);
	}
	
}
