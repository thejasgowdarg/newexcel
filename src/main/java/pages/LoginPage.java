package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath = "//select[@id=\"ddlFinYear\"]")
	WebElement financialyear1;
	
	@FindBy(xpath = "//input[@id=\"txtUsername\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@id=\"txtPassword\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@id=\"btnLogin\"]")
	WebElement lgnbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
   public SearchPage loggiiins(String fy,String un,String pw ) throws Exception {
	   financialyear1.sendKeys(fy);
//	   Select year = new Select(financialyear1);
//       year.selectByVisibleText("2023-24");
	   Thread.sleep(2000);
	   username.sendKeys(un);
	   Thread.sleep(2000);
	   password.sendKeys(pw);
	   Thread.sleep(2000);
	   lgnbtn.click();
	   Thread.sleep(4000);
	   return new SearchPage();
	   
   }
}
