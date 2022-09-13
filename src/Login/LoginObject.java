package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	WebDriver driver;
	
	public LoginObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;


	public void usernameInput(String user) {
		username.sendKeys(user);
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;


	public void passwordInput(String pass) {
		password.sendKeys(pass);
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	public void logInClick() {
		login.click();
	}
}

