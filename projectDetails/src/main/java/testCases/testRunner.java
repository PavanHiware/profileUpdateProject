package testCases;

import org.testng.annotations.Test;

import pageObjects.naukariHomePage;
import pageObjects.naukariLoginPage;

public class testRunner extends baseClass {

	@Test(priority = 1)

	public void testCase_01() throws InterruptedException {
		naukariHomePage naukariProfile = new naukariHomePage(driver);
		naukariLoginPage loginPage = new naukariLoginPage(driver);
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		loginPage.loginToProfile();
		loginPage.enterCandidateInformation("pavanhiware11@gmail.com", "Pavan@7218");
		naukariProfile.validateHomePage("Pavan Hiware");
		naukariProfile.openCandidateProfile("Pavan Hiware");
		naukariProfile.updateCandidateName("PAVAN HIWARE");

	}

}
