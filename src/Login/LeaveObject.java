package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LeaveObject {
	WebDriver driver;
	
	public LeaveObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@href='/web/index.php/leave/viewLeaveModule']")
	WebElement leave;


	public void leaveClick() {
		leave.click();;
	}

}

