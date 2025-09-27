package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class naukariHomePage {
WebDriver driver;

	public naukariHomePage(WebDriver driver) {
		this.driver = driver;

	}
	
	By nameWrapperNameofCandidate = By.xpath("//*[@class='name-wrapper']/div");
	By symbol_notification = By.xpath("//*[@class='nI-gNb-notif-center']/div/span");
	By button_viewProfile = By.xpath("//*[@class='view-profile-wrapper']/a");
	By candidateName_profile = By.xpath("//*[@class='txt-wrapper col']/div[1]/div/div/span[1]"); 
	By button_editSymbol = By.xpath("//*[@class='txt-wrapper col']/div[1]/div/div/em"); 
	By inputbox_nameUpdateBox = By.xpath("//*[@id='name']");
	By button_save = By.xpath("//*[@id='saveBasicDetailsBtn']"); 
	
	public void validateHomePage(String nameOfCandidate) throws InterruptedException {
		Thread.sleep(2000);
		String profileName = driver.findElement(nameWrapperNameofCandidate).getText();
		Assert.assertEquals(profileName, nameOfCandidate);
		System.out.println("validate homepgae");
		System.out.println("Name: "+profileName);
	}
	
	public void openNotification() throws InterruptedException {
		driver.findElement(symbol_notification).click();
		
	}
	
	public void openCandidateProfile(String nameOfCandidate) throws InterruptedException {
		driver.findElement(button_viewProfile).click();
		Thread.sleep(2000);
		String profileName = driver.findElement(candidateName_profile).getText();
		System.out.println("validate loginPopup");
		System.out.println("Name: "+profileName);
		Assert.assertEquals(profileName, nameOfCandidate);
//		Assert.assertEquals(profileName, nameOfCandidate);
		
	}
	
	public void updateCandidateName(String nameToBeUpdated) throws InterruptedException {
		driver.findElement(button_editSymbol).click();
		WebElement nameTab = driver.findElement(inputbox_nameUpdateBox);
		Thread.sleep(2000);
		nameTab.clear();
		nameTab.sendKeys(nameToBeUpdated);
		driver.findElement(button_save).click();
		
		
	}
	
	
}
