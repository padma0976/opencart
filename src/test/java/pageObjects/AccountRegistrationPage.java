package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	WebElement txtFirstname = driver.findElement(By.xpath("//input[@name='firstname']"));

	
	WebElement txtLastname = driver.findElement(By.xpath("//input[@id='lastname']"));
	
	WebElement txtEmail = driver.findElement(By.xpath("//input[@name='email']"));
	
	WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
	
	WebElement txtconfmPassword = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
	
	
	WebElement btnCreate = driver.findElement(By.xpath("//button[@class='action submit primary']"));
	
	WebElement msgConfirmation = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);

	}

	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void setConfirmPassword(String pwd) {
		txtconfmPassword.sendKeys(pwd);

	}


	public void clickContinue() {
		

		Actions act=new Actions(driver);
		act.moveToElement(btnCreate).click().perform();
						
		
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
	

}
