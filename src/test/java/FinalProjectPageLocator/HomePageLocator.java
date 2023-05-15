package FinalProjectPageLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FinalProjectUtility.FinalProject2Base;

public class HomePageLocator extends FinalProject2Base {
	
	public HomePageLocator () {
		PageFactory.initElements(driver, this);

	}
	@FindBy (id = "signin2")
	public WebElement SignUpLink;
		
	}
	
	
		
	
	


