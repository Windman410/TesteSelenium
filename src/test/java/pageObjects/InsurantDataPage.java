package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

import static utils.Utils.*;

import java.util.List;

public class InsurantDataPage {
	
	public InsurantDataPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "firstname")
	private WebElement inputFirstName;	

	@FindBy(id = "lastname")
	private WebElement inputLastName;
	
	@FindBy(id = "birthdate")
	private WebElement inputBirthDate;

	@FindBy(xpath = "//input[@id='gendermale']/following-sibling::span")
	private WebElement radioGenderMale;

	@FindBy(xpath = "//input[@id='genderfemale']/following-sibling::span")
	private WebElement radioGenderFemale;

	@FindBy(id = "streetaddress")
	private WebElement inputStreetAdress;

	@FindBy(id = "country")
	private WebElement selectCountry;

	@FindBy(xpath = "//option[@value='Angola']")
	private WebElement selectCountryOption;

	@FindBy(id = "zipcode")
	private WebElement inputZipCode;
	
	@FindBy(id = "city")
	private WebElement inputCity;

	@FindBy(id = "occupation")
	private WebElement selectOccupation;

	@FindBy(xpath = "//option[@value='Employee']")
	private WebElement selectOccupationOption;

	@FindBy(xpath = "//input[@id='speeding']/following-sibling::span")
	private WebElement checkboxHobbiesSpeeding;
	
	@FindBy(xpath = "//input[@id='bungeejumping']/following-sibling::span")
	private WebElement checkboxHobbiesBungeeJumping;
	
	@FindBy(xpath = "//input[@id='cliffdiving']/following-sibling::span")
	private WebElement checkboxHobbiesCliffDiving;
	
	@FindBy(xpath = "//input[@id='skydiving']/following-sibling::span")
	private WebElement checkboxHobbiesSkydiving;
	
	@FindBy(xpath = "//input[@id='other']/following-sibling::span")
	private WebElement checkboxHobbiesOther;

	@FindBy(id = "website")
	private WebElement inputWebsite;

	@FindBy(id = "picture")
	private WebElement inputPicture; //src\test\resources\foto.png

	@FindBy(id = "nextenterproductdata")
	private WebElement buttonNext;	

	public WebElement inputFirstName() {
		if(inputFirstName.isDisplayed()) {
			return inputFirstName;
		} else {
			Assert.fail("Campo First Name nao encontrado");
			return null;
		}		
	}

	public WebElement inputLastName() {
		if(inputLastName.isDisplayed()) {
			return inputLastName;
		} else {
			Assert.fail("Campo Last Name nao encontrado");
			return null;
		}		
	}

	public WebElement inputBirthDate() {
		if(inputBirthDate.isDisplayed()) {
			return inputBirthDate;
		} else {
			Assert.fail("Campo Birth Date nao encontrado");
			return null;
		}		
	}

	public WebElement inputStreetAdress() {
		if(inputStreetAdress.isDisplayed()) {
			return inputStreetAdress;
		} else {
			Assert.fail("Campo Street Adress nao encontrado");
			return null;
		}		
	}

	public WebElement selectCountry() {
		if(selectCountry.isDisplayed()) {
			return selectCountry;
		} else {
			Assert.fail("select Country nao encontrado");
			return null;
		}		
	}

	public WebElement inputZipCode() {
		if(inputZipCode.isDisplayed()) {
			return inputZipCode;
		} else {
			Assert.fail("Campo Zip Code nao encontrado");
			return null;
		}		
	}

	public WebElement inputCity() {
		if(inputCity.isDisplayed()) {
			return inputCity;
		} else {
			Assert.fail("Campo City nao encontrado");
			return null;
		}		
	}

	public WebElement selectOccupation() {
		if(selectOccupation.isDisplayed()) {
			return selectOccupation;
		} else {
			Assert.fail("Select Occupation nao encontrado");
			return null;
		}		
	}

	public WebElement inputWebsite() {
		if(inputWebsite.isDisplayed()) {
			return inputWebsite;
		} else {
			Assert.fail("Campo Website nao encontrado");
			return null;
		}		
	}

	public WebElement inputPicture() {
		if(inputPicture.isDisplayed()) {
			return inputPicture;
		} else {
			Assert.fail("Campo Picture nao encontrado");
			return null;
		}		
	}

	public WebElement buttonNext() {
			return buttonNext;
	}
	
	public WebElement selectCountryOption(String option) {		
		selectCountryOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectCountryOption.isDisplayed()) {
			return selectCountryOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}	
	
	public WebElement selectOccupationOption(String option) {		
		selectOccupationOption.findElement(By.xpath("//option[@value='"+option+"']"));
		if(selectOccupationOption.isDisplayed()) {
			return selectOccupationOption;
		} else {
			Assert.fail("Opcao "+option+" nao encontrado");
			return null;
		}	
	}	

	public WebElement radioGender(String option) {
		if(option.equals("Male")) {
			if(radioGenderMale.isDisplayed()) {
				return radioGenderMale;
			} else {
				Assert.fail("Radio "+option+" nao encontrado");
				return null;
			}	
		} else if(option.equals("Female")) {
			if(radioGenderFemale.isDisplayed()) {
				return radioGenderFemale;
			} else {
				Assert.fail("Radio "+option+" nao encontrado");
				return null;
			}	
		} else {
			Assert.fail("Opcao Invalida para radio Gender");
			return null;
		}
	}
	
	public void checkboxHobbies(DataTable table) {
		List<String> hobbies = table.cells().get(0);
		for (String hobby : hobbies) {			
			if(hobby.equals("Speeding")) {
				if(checkboxHobbiesSpeeding.isDisplayed()) {
					checkboxHobbiesSpeeding.click();
				} else {
					Assert.fail("Checkbox "+hobby+" nao encontrado");					
				}	
			} 

			if(hobby.equals("Bungee Jumping")) {
				if(checkboxHobbiesBungeeJumping.isDisplayed()) {
					checkboxHobbiesBungeeJumping.click();
				} else {
					Assert.fail("Checkbox "+hobby+" nao encontrado");					
				}	
			} 
			
			if(hobby.equals("Cliff Diving")) {
				if(checkboxHobbiesCliffDiving.isDisplayed()) {
					checkboxHobbiesCliffDiving.click();
				} else {
					Assert.fail("Checkbox "+hobby+" nao encontrado");					
				}	
			} 
			
			if(hobby.equals("Skydiving")) {
				if(checkboxHobbiesSkydiving.isDisplayed()) {
					checkboxHobbiesSkydiving.click();
				} else {
					Assert.fail("Checkbox "+hobby+" nao encontrado");					
				}	
			} 
			
			if(hobby.equals("Other")) {
				if(checkboxHobbiesOther.isDisplayed()) {
					checkboxHobbiesOther.click();
				} else {
					Assert.fail("Checkbox "+hobby+" nao encontrado");					
				}	
			} 
		}
	}
}
