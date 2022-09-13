package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@href='/web/index.php/admin/viewAdminModule']")
	WebElement admin;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	public LoginObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void usernameInput(String user) {
		username.sendKeys(user);
	}

	public void passwordInput(String pass) {
		password.sendKeys(pass);
	}

	public void logInClick() {
		login.click();
	}
	
}

