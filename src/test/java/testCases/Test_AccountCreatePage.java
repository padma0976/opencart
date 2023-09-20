package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class Test_AccountCreatePage extends BaseClass {
	
	

	@Test
	public void test_Account_Registration_Page() throws InterruptedException {
		
		//logger.info("Strating Test_AccountCreationnPage...");
		try {

			HomePage hp = new HomePage(driver);

			//hp.clickCreatePage();
			
			//logger.info("Clicked on Creation Page");


			AccountRegistrationPage arp = new AccountRegistrationPage(driver);
			
			//logger.info("****Providing Customer data****");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			arp.setFirstName(randomeString().toUpperCase());

			arp.setLastName(randomeString().toUpperCase());

			arp.setEmail(randomeString()+"@gmail.com");

			String password=randomAlphaNumeric();
			arp.setPassword(password);
			arp.setConfirmPassword(password);

			arp.clickContinue();

			String confmsg = arp.getConfirmationMsg();

			Assert.assertEquals(confmsg, "My Account");
		} catch (Exception e) {

			Assert.fail();
		}

	}

}
