package FinalProjectPageAction.java;

import org.testng.Assert;

import FinalProjectPageLocator.SignUpPageLocator;
import FinalProjectUtility.FinalProject2Base;

public class SignUpPageAction extends FinalProject2Base {
	SignUpPageLocator  signUpPageLocator = new SignUpPageLocator ();
	
	public void userCard (String u, String p) {
		signUpPageLocator.UserName.sendKeys(u);
		signUpPageLocator.Password.sendKeys(p);
		signUpPageLocator.SignUpButton.click();
		
	}
	public void verifyUserSignUp () {
		boolean SignupValidate = signUpPageLocator.Signup.isDisplayed();
		Assert.assertTrue(SignupValidate);
	}

}
