package FinalProjectPageAction.java;

import FinalProjectPageLocator.HomePageLocator;
import FinalProjectUtility.FinalProject2Base;

public class HomePageAction extends FinalProject2Base {
	HomePageLocator  homePageLocator = new HomePageLocator ();
	
	public void SignupLink () {
		homePageLocator.SignUpLink.click();
		
	}

}
