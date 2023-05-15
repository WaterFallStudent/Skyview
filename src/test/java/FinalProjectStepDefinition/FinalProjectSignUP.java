package FinalProjectStepDefinition;

import FinalProjectPageAction.java.HomePageAction;
import FinalProjectPageAction.java.SignUpPageAction;
import FinalProjectUtility.FinalProject2Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FinalProjectSignUP extends FinalProject2Base {
	HomePageAction  homePageAction = new HomePageAction ();
	SignUpPageAction signUpPageAction = new SignUpPageAction ();
	
	@Given("^Open Demoblaze \"([^\"]*)\"application URL$")
	public void open_Demoblaze_application_URL(String URL) throws Throwable {
		FinalProject2URL (URL);
		
	}
	@Then("^Click Sign up Link$")
	public void click_Sign_up_Link() throws Throwable {
		homePageAction.SignupLink();
	   
	}

	@Then("^Enter Username and password and click Sign up(\\d+) button$")
	public void enter_Username_and_password_and_click_Sign_up_button(int arg1) throws Throwable {
		signUpPageAction.userCard(fp2.getProperty("Username"), fp2.getProperty("Password"));
		
	    
	}

	@Then("^Verify User can Sign up successfully$")
	public void verify_User_can_Sign_up_successfully() throws Throwable {
		signUpPageAction.verifyUserSignUp();
	
	
	    
	}


}

	