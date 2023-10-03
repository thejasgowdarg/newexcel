package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SearchPage extends Base{
	
	@FindBy(xpath = "//input[@id=\"txtSearch\"]")
	WebElement saerch;
	
	@FindBy(xpath = "//input[@id=\"imgSearch\"]")
	WebElement searchicon;
	
	@FindBy(xpath = "//option[@value=\"5712\"]")
	WebElement branchclick;
	
	@FindBy(xpath = "//input[@id=\"btnSelect\"]")
	WebElement selectbtn;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public MasterNonEmp seareeees(String bcode) throws Exception {
		saerch.sendKeys(bcode);
		Thread.sleep(2000);
		searchicon.click();
		Thread.sleep(2000);
		branchclick.click();
		Thread.sleep(2000);
		selectbtn.click();
		Thread.sleep(4000);
		return new MasterNonEmp();
		
	}

}
