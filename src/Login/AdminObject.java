package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminObject {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@href='/web/index.php/admin/viewAdminModule']")
	WebElement admin;

	public AdminObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void adminClick() {
		admin.click();;
	}

}