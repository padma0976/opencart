package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccouuntPage;
import testBase.BaseClass;

public class Test_AccountloginPage extends BaseClass {
	
	
	@Test(groups= {"Regression" ,"Master"})
	public void test_login()
	{
		
		
		try {
	
		
		HomePage hp= new HomePage(driver);
		hp.clickLoginPage();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		
		lp.setPass(rb.getString("password"));
		lp.clickLogin();
		
		MyAccouuntPage mp = new MyAccouuntPage(driver);
		
		boolean targetPage = mp.isMyAccountExist();
		
		Assert.assertEquals(targetPage, true);
		
		}catch(Exception e) {
			
			Assert.fail();
		}
		
	}

}
