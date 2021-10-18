package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static utils.Utils.*;


public class VehicleDataPage {
	
	public VehicleDataPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "make")
	private WebElement selectMake;	
	
	@FindBy(xpath = "//option[@value='Audi']")
	private WebElement selectMakeOptions;
	
	@FindBy(id = "model")
	private WebElement selectModel;	
	
	@FindBy(xpath  = "//option[@value='Scooter']")
	private WebElement selectModelOptions;

	@FindBy(id = "cylindercapacity")
	private WebElement inputCylinderCapacity;
	
	@FindBy(id  = "engineperformance")
	private WebElement inputEnginePerformance;
	
	@FindBy(id = "dateofmanufacture")
	private WebElement inputDateOfManufacture; //MM/DD/YYYY
	
	@FindBy(id  = "numberofseats")
	private WebElement selectNumberOfSeats;

	@FindBy(xpath = "//option[@value='4']")
	private WebElement selectNumberOfSeatsOptions;
	
	@FindBy(xpath = "//input[@id='righthanddriveyes']/following-sibling::span")
	private WebElement radioRightHandDriverYes;
	
	@FindBy(xpath = "//input[@id='righthanddriveno']/following-sibling::span")
	private WebElement radioRightHandDriverNo;
	
	@FindBy(id  = "numberofseatsmotorcycle")
	private WebElement selectNumberOfSeatsMotorcycle;

	@FindBy(xpath = "//option[@value='1']")
	private WebElement selectNumberOfSeatsMotorcycleOptions;
	
	@FindBy(id  = "fuel")
	private WebElement selectFuel;

	@FindBy(xpath = "//option[@value='Gas']")
	private WebElement selectFuelOptions;
		
	@FindBy(id  = "payload")
	private WebElement inputPayload;

	@FindBy(id = "totalweight")
	private WebElement inputTotalWeight;
	
	@FindBy(id  = "listprice")
	private WebElement inputListPrice;
	
	@FindBy(id = "licenseplatenumber")
	private WebElement inputLicensePlateNumber;

	@FindBy(id  = "annualmileage")
	private WebElement inputAnnualMileage;
	
	@FindBy(id  = "nextenterinsurantdata")
	private WebElement buttonNext;
	
	public WebElement selectMake() {
		if(selectMake.isDisplayed()) {
			return selectMake;
		} else {
			Assert.fail("Select Make nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputEnginePerformance() {
		if(inputEnginePerformance.isDisplayed()) {
			return inputEnginePerformance;
		} else {
			Assert.fail("Campo Engine Performance nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputDateOfManufacture() {
		if(inputDateOfManufacture.isDisplayed()) {
			return inputDateOfManufacture;
		} else {
			Assert.fail("Campo Date Of Manufacture nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectNumberOfSeats() {
		if(selectNumberOfSeats.isDisplayed()) {
			return selectNumberOfSeats;
		} else {
			Assert.fail("Select Number Of Seats nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectFuel() {
		if(selectFuel.isDisplayed()) {
			return selectFuel;
		} else {
			Assert.fail("Select Fuel nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputListPrice() {
		if(inputListPrice.isDisplayed()) {
			return inputListPrice;
		} else {
			Assert.fail("Campo List Price nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputLicensePlateNumber() {
		if(inputLicensePlateNumber.isDisplayed()) {
			return inputLicensePlateNumber;
		} else {
			Assert.fail("Campo License Plate Number nao encontrado");
			return null;
		}		
	}

	public WebElement inputAnnualMileage() {
		if(inputAnnualMileage.isDisplayed()) {
			return inputAnnualMileage;
		} else {
			Assert.fail("Campo Annual Mileage nao encontrado");
			return null;
		}		
	}
	
	public WebElement buttonNext() {
			return buttonNext;
	}
	
	public WebElement selectMakeOptions(String option) {		
		selectMakeOptions.findElement(By.xpath("//select[@id='make']/option[@value='"+option+"']"));
		if(selectMakeOptions.isDisplayed()) {
			return selectMakeOptions;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}
	
	public WebElement selectModelOptions(String option) {		
		selectModelOptions.findElement(By.xpath("//select[@id='model']/option[@value='"+option+"']"));
		if(selectModelOptions.isDisplayed()) {
			return selectModelOptions;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}
	
	public WebElement selectNumberOfSeatsOptions(String option) {		
		selectNumberOfSeatsOptions.findElement(By.xpath("//select[@id='numberofseats']/option[@value='"+option+"']"));
		if(selectNumberOfSeatsOptions.isDisplayed()) {
			return selectNumberOfSeatsOptions;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}
	
	public WebElement selectNumberOfSeatsMotorcycleOptions(String option) {		
		selectNumberOfSeatsMotorcycleOptions.findElement(By.xpath("//select[@id='numberofseatsmotorcycle']/option[@value='"+option+"']"));
		if(selectNumberOfSeatsMotorcycleOptions.isDisplayed()) {
			return selectNumberOfSeatsMotorcycleOptions;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}
	
	public WebElement selectFuelOptions(String option) {		
		selectFuelOptions.findElement(By.xpath("//select[@id='fuel']/option[@value='"+option+"']"));
		if(selectFuelOptions.isDisplayed()) {
			return selectFuelOptions;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}
	
	public WebElement radioRightHandDriver(String option) {
		if(option.equals("Yes")) {
			if(radioRightHandDriverYes.isDisplayed()) {
				return radioRightHandDriverYes;
			} else {
				Assert.fail("Radio "+option+" nao encontrado");
				return null;
			}	
		} else if(option.equals("No")) {
			if(radioRightHandDriverNo.isDisplayed()) {
				return radioRightHandDriverNo;
			} else {
				Assert.fail("Radio "+option+" nao encontrado");
				return null;
			}	
		} else {
			Assert.fail("Opcao Invalida para radio Right Hand Driver");
			return null;
		}
	}
}
