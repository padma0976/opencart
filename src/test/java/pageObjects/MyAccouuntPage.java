package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccouuntPage extends BasePage {

	public MyAccouuntPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	WebElement msgHeading = driver.findElement(By.xpath("//*[@class='logo']"));
	
	
	

	
	public boolean isMyAccountExist()
	{
		try 
		{
			
			return(msgHeading.isDisplayed());
			
		} catch(Exception e)
		{
			
		}
		return false;
	}
}
