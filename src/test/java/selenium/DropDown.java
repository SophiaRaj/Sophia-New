package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		WebElement dropdown1 = driver.findElement(By.name("DateOfBirthDay")); 
		Select sel1 = new Select (dropdown1); 
		sel1.selectByValue("17");

	  WebElement dropdown2 = driver.findElement(By.name("DateOfBirthMonth"));
	  Select sel2 = new Select (dropdown2);
	  sel2.selectByVisibleText("December");
	  
	  WebElement dropdown3 = driver.findElement(By.name("DateOfBirthYear"));
	  Select sel3 = new Select (dropdown3);
	  sel3.selectByVisibleText("1997");

	}

}
