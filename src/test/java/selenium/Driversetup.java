package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driversetup {

		public static void main(String[] args) {
			
			//Driversetup
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		    
	
		 String url = "https://www.easemytrip.com/" ; 
		 driver.get(url);
		 
		 driver.navigate().to("https://www.amazon.in/");
			
			driver.navigate().forward();
			
			driver.navigate().back();
			
			driver.navigate().refresh();
	driver.close();
	driver.quit();

	}

}
