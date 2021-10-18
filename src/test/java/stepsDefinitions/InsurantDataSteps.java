package stepsDefinitions;


import io.cucumber.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import pageObjects.PriceOptionQuotePage;
import pageObjects.InsurantDataPage;
import static utils.Utils.espera; 

public class InsurantDataSteps {
	InsurantDataPage id = new InsurantDataPage();
	
	@Quando("eu digitar no campo First Name {string}")
	public void euDigitarNoCampoFirstName(String name) throws InterruptedException {
		id.inputFirstName().sendKeys(name);
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo Last Name {string}")
	public void euDigitarNoCampoLastName(String name) throws InterruptedException {
		id.inputLastName().sendKeys(name);
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo Date of Birth {string}")
	public void euDigitarNoCampoDateOfBirth(String date) throws InterruptedException {
		id.inputBirthDate().sendKeys(date);
		Thread.sleep(espera);
	}

	@Quando("eu selecionar o radio {string} no campo Gender")
	public void euSelecionarORadioNoCampoGender(String gender) throws InterruptedException {
		id.radioGender(gender).click();
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo Street Address {string}")
	public void euDigitarNoCampoStreetAddress(String address) throws InterruptedException {
		id.inputStreetAdress().sendKeys(address);
		Thread.sleep(espera);
	}

	@Quando("eu selecionar no campo Country a opcao {string}")
	public void euSelecionarNoCampoCountryAOpcao(String country) throws InterruptedException {
		id.selectCountry().click();
		Thread.sleep(espera);
		id.selectCountryOption(country).click();
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo Zip Code {string}")
	public void euDigitarNoCampoZipCode(String zip) throws InterruptedException {
		id.inputZipCode().sendKeys(zip);
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo City {string}")
	public void euDigitarNoCampoCity(String city) throws InterruptedException {
		id.inputCity().sendKeys(city);
		Thread.sleep(espera);
	}

	@Quando("eu selecionar no campo Occupation a opcao {string}")
	public void euSelecionarNoCampoOccupationAOpcao(String occupation) throws InterruptedException {
		id.selectOccupation().click();
		id.selectOccupationOption(occupation).click();
		Thread.sleep(espera);
	}
	
	@Quando("eu digitar no campo Website {string}")
	public void euDigitarNoCampoWebsite(String website) throws InterruptedException {
		id.inputWebsite().sendKeys(website);
		Thread.sleep(espera);
	}

	@Quando("eu digitar no campo Picture {string}")
	public void euDigitarNoCampoPicture(String picture) throws InterruptedException {
		id.inputPicture().sendKeys(picture);
		Thread.sleep(espera);
	}

	@Quando("eu selecionar os checkbox no campo Hobbies")
	public void euSelecionarOsCheckboxNoCampoHobbies(DataTable hobbies) throws InterruptedException {
		id.checkboxHobbies(hobbies);
		Thread.sleep(espera);
	}

}
