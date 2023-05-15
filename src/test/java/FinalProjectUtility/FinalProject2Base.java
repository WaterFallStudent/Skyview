package FinalProjectUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FinalProject2Base {
	public static WebDriver driver;
	public static Properties fp2;
	
	
	public FinalProject2Base () {
		try {
			FileInputStream FinalProject2File = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\FinalProjectConfiguration\\FinalProject2Config.properties");
			fp2 = new Properties ();
			fp2.load(FinalProject2File);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please check your code");
			e.printStackTrace();
		}
		
	}
	public void FinalProject2Browser () {
		String Browser = fp2.getProperty("FinalProject2Browser1"); 
		if (Browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\FinalProjectDriver\\chromedriver.exe");
			//driver = new ChromeDriver ();
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Edge Driver\\msedgedriver.exe");
			driver = new EdgeDriver ();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FinalProject2TestData.implicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FinalProject2TestData.pageLoadTimeout));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		else if (Browser.equalsIgnoreCase("FF"));
			
			
		}
		public static void FinalProject2URL (String URL) {
			driver.get(fp2.getProperty("URLFP"));
			
		}
	}
	
	


