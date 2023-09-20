package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	WebElement txtEmailAddress= driver.findElement(By.xpath("//input[@name='login[username]']"));
	

	
	WebElement txtPassword= driver.findElement(By.xpath("//input[@name='login[password]']"));
	
	
	WebElement btnSignin= driver.findElement(By.xpath("//button[@class='action login primary']"));
	

	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPass(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnSignin.click();
	}
}
