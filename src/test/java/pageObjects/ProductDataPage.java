package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import static utils.Utils.*; 

public class ProductDataPage {

	
	public ProductDataPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "startdate")
	private WebElement inputStartDate;
	
	@FindBy(id = "insurancesum")
	private WebElement selectInsuranceSum;

	@FindBy(xpath = "//option[@value='3000000']")
	private WebElement selectInsuranceSumOption;

	@FindBy(id = "meritrating")
	private WebElement selectMeritRating;

	@FindBy(xpath = "//option[@value='Bonus 4']")
	private WebElement selectMeritRatingOption;

	@FindBy(id = "damageinsurance")
	private WebElement selectDamageInsurance;

	@FindBy(xpath = "//option[@value='Partial Coverage']")
	private WebElement selectDamageInsuranceOption;

	@FindBy(xpath = "//input[@id='EuroProtection']/following-sibling::span")
	private WebElement checkboxOptionalEuroProtection;
	
	@FindBy(xpath = "//input[@id='LegalDefenseInsurance']/following-sibling::span")
	private WebElement checkboxOptionalLegalDefenseInsurance;
	
	@FindBy(id = "courtesycar")
	private WebElement selectCourtesyCar;

	@FindBy(xpath = "//option[@value='Yes']")
	private WebElement selectCourtesyCarOption;
	
	@FindBy(id = "nextselectpriceoption")
	private WebElement buttonNext;	

	public WebElement inputStartDate() {
		if(inputStartDate.isDisplayed()) {
			return inputStartDate;
		} else {
			Assert.fail("Campo Start Date nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectInsuranceSum() {
		if(selectInsuranceSum.isDisplayed()) {
			return selectInsuranceSum;
		} else {
			Assert.fail("Select Insurance Sum nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectMeritRating() {
		if(selectMeritRating.isDisplayed()) {
			return selectMeritRating;
		} else {
			Assert.fail("Select Merit Rating nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectDamageInsurance() {
		if(selectDamageInsurance.isDisplayed()) {
			return selectDamageInsurance;
		} else {
			Assert.fail("Select Damage Insurance nao encontrado");
			return null;
		}		
	}
	
	public WebElement selectCourtesyCar() {
		if(selectCourtesyCar.isDisplayed()) {
			return selectCourtesyCar;
		} else {
			Assert.fail("Select Courtesy Car nao encontrado");
			return null;
		}		
	}

	public WebElement buttonNext() {
			return buttonNext;
	}

	public WebElement selectInsuranceSumOption(String option) {		
		selectInsuranceSumOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectInsuranceSumOption.isDisplayed()) {
			return selectInsuranceSumOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}		
	}	

	public WebElement selectMeritRatingOption(String option) {		
		selectMeritRatingOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectMeritRatingOption.isDisplayed()) {
			return selectMeritRatingOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}	

	public WebElement selectDamageInsuranceOption(String option) {		
		selectDamageInsuranceOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectDamageInsuranceOption.isDisplayed()) {
			return selectDamageInsuranceOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}	
	
	public WebElement selectCourtesyCarOption(String option) {		
		selectCourtesyCarOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectCourtesyCarOption.isDisplayed()) {
			return selectCourtesyCarOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}	

	public void checkboxOptional(DataTable table) {
		List<String> OptionalProducts = table.cells().get(0);
		for (String product : OptionalProducts) {			
			if(product.equals("Euro Protection")) {
				if(checkboxOptionalEuroProtection.isDisplayed()) {
					checkboxOptionalEuroProtection.click();
				} else {
					Assert.fail("Checkbox "+product+" nao encontrado");					
				}					
			} 
			
			if(product.equals("Legal Defense Insurance")) {
				if(checkboxOptionalLegalDefenseInsurance.isDisplayed()) {
					checkboxOptionalLegalDefenseInsurance.click();
				} else {
					Assert.fail("Checkbox "+product+" nao encontrado");					
				}					
			} 			
		}
	}
}
