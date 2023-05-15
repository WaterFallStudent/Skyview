package FinalProjectPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FinalProjectUtility.FinalProject2Base;

public class SignUpPageLocator extends FinalProject2Base {
	
	public SignUpPageLocator () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "sign-username")
	public WebElement UserName;
	
	@FindBy (id = "sign-password")
	public WebElement Password;
	
	@FindBy (xpath = "//button [text ()= 'Sign up']")
	public WebElement SignUpButton;
	
	@FindBy (xpath = "//button [text ()= 'Sign up']")
	public WebElement Signup;

}
