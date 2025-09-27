package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class naukariLoginPage {
	WebDriver driver;

	public naukariLoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By button_loginTab = By.linkText("Login");
	By inputbox_userName = By.xpath("//*[@class='form']/div[2]/input");
	By inputbox_password = By.xpath("//*[@class='form']/div[3]/input");
	By button_login = By.xpath("//button[@class='btn-primary loginButton']");

	public void loginToProfile() {
		driver.findElement(button_loginTab).click();
	}

	public void enterCandidateInformation(String userName, String password) {
		driver.findElement(inputbox_userName).sendKeys(userName);
		driver.findElement(inputbox_password).sendKeys(password);
		driver.findElement(button_login).click();

	}

}
