package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "txtUsername")
	WebElement userName;
	

	@FindBy(id = "txtPassword")
	WebElement passwd;
	

	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUser) {
		userName.sendKeys(strUser);
	}
	
	public void setpasswd(String strPswd) {
		userName.sendKeys(strPswd);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
}
//@FindBys need all Conditions met,  @FindALL needs either met