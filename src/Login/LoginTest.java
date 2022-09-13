package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "webDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "LoginDatas", dataProviderClass = LoginData.class, priority = 1)
	public void loginData(String Username, String Password) throws InterruptedException {
		LoginObject login = new LoginObject(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		login.usernameInput(Username);
		login.passwordInput(Password);
		login.logInClick();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500);");
		Thread.sleep(1000);
		
		AdminObject admin = new AdminObject(driver);
		admin.adminClick();
		Thread.sleep(1000);
		
		LeaveObject leave = new LeaveObject(driver);
		leave.leaveClick();
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void driverClose() {
		driver.close();
	}
}
