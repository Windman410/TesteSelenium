package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.fail;
import static utils.Utils.*;

public class PriceOptionQuotePage { 
	
	public PriceOptionQuotePage() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(xpath = "//input[@id='selectsilver']/following-sibling::span")
	private WebElement radioPriceOptionSilver;		
	
	@FindBy(xpath = "//input[@id='selectgold']/following-sibling::span")
	private WebElement radioPriceOptionGold;	
	
	@FindBy(xpath = "//input[@id='selectplatinum']/following-sibling::span")
	private WebElement radioPriceOptionPlatinum;	
	
	@FindBy(xpath = "//input[@id='selectultimate']/following-sibling::span")
	private WebElement radioPriceOptionUltimate;		

	@FindBy(id = "email")
	private WebElement inputEmail;

	@FindBy(id = "phone")
	private WebElement inputPhone;

	@FindBy(id = "username")
	private WebElement inputUsername;

	@FindBy(id = "password")
	private WebElement inputPassword;

	@FindBy(id = "confirmpassword")
	private WebElement inputConfirmPassword;

	@FindBy(id = "Comments")
	private WebElement inputComments;

	@FindBy(id = "nextsendquote")
	private WebElement buttonNext;
	
	@FindBy(id = "sendemail")
	private WebElement buttonSend;
	
	public WebElement inputEmail() {
		if(inputEmail.isDisplayed()) {
			return inputEmail;
		} else {
			Assert.fail("Campo Email nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputPhone() {
		if(inputPhone.isDisplayed()) {
			return inputPhone;
		} else {
			Assert.fail("Campo Phone nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputUsername() {
		if(inputUsername.isDisplayed()) {
			return inputUsername;
		} else {
			Assert.fail("Campo Username nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputPassword() {
		if(inputPassword.isDisplayed()) {
			return inputPassword;
		} else {
			Assert.fail("Campo Password nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputConfirmPassword() {
		if(inputConfirmPassword.isDisplayed()) {
			return inputConfirmPassword;
		} else {
			Assert.fail("Campo Confirm Password nao encontrado");
			return null;
		}		
	}
	
	public WebElement inputComments() {
		if(inputComments.isDisplayed()) {
			return inputComments;
		} else {
			Assert.fail("Campo Comments nao encontrado");
			return null;
		}		
	}
	
	public WebElement buttonNext() {
			return buttonNext;
	}
	
	public WebElement buttonSend() {
		if(buttonSend.isDisplayed()) {
			return buttonSend;
		} else {
			Assert.fail("Botao Send nao encontrado");
			return null;
		}		
	}
	
	public WebElement radioPriceOption(String option) {
		if(option.equals("Silver")) {
			if(radioPriceOptionSilver.isDisplayed()) {
				return radioPriceOptionSilver;
			} else {
				Assert.fail("Opcao "+option+" nao encontrada");
				return null;
			}
		} else if(option.equals("Gold")) {
			if(radioPriceOptionGold.isDisplayed()) {
				return radioPriceOptionGold;
			}	 else {
				Assert.fail("Opcao "+option+" nao encontrada");
				return null;
			}
		}  else if(option.equals("Platinum")) {
			if(radioPriceOptionPlatinum.isDisplayed()) {
				return radioPriceOptionPlatinum;
			}	 else {
				Assert.fail("Opcao "+option+" nao encontrada");
				return null;
			}
		}  else if(option.equals("Ultimate")) {
			if(radioPriceOptionUltimate.isDisplayed()) {
				return radioPriceOptionUltimate;
			}	 else {
				Assert.fail("Opcao "+option+" nao encontrada");
				return null;
			}
		} else {
			Assert.fail("Opcao Invalida para radio Price Option");
			return null;
		}
	}
	

}