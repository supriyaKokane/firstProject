package com.firstproject.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.firstproject.QA.Base.BrowserSetup;
import com.firstproject.QA.Pages.RegistrationPage;
import com.firstproject.QA.Utility.ExcelSheet;
import com.firstproject.QA.Utility.UtilityClass;

public class RegistrationTest extends BrowserSetup {
	
	@BeforeClass
	public void bsetup() {
		BrowserSetup.Setup("chrome");
	}
	
	@Test
	public void FbRegistrationPageTest() throws IOException {
		
		RegistrationPage test=new RegistrationPage(driver);
		
		String name=ExcelSheet.fetchData(1, 0);
		String lastname=ExcelSheet.fetchData(1, 1);
		String email=ExcelSheet.fetchData(1, 2);
		String password=ExcelSheet.fetchData(1, 3);
		
		test.VerifyFbRegistrationPageFbLogo();
		test.VerifyFbRegistrationPageTagline();
		test.VerifyFbRegistrationPageAlreadyAccountLink();
		test.VerifyFbRegistrationPageFooterLinks();
		test.SetFbRegistrationPageFirstname(name);
		test.SetFbRegistrationPageLastname(lastname);
		test.SetFbRegistrationPageMobileEmail(email);
		test.SetFbRegistrationPagePassword(password);
		test.SetFbRegistrationPageBirthDate();
		test.SetFbRegistrationPageBirthMonth();
		test.SetFbRegistrationPageBirthYear();
		test.SetFbRegistrationPageGender("female");
		
		UtilityClass.ScreenShot("Registration Page1");
		
		test.ClickFbRegistrationPageLoginBtn();
        
	}
	
	@AfterClass
	public void bclose() {
		driver.quit();
	}

}
