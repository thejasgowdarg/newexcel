package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class DeductionPage extends Base{
	
	@FindBy(xpath = "//a[normalize-space()=\"Form 26Q\"]")
	WebElement form26q;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement quartor1;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[5]/table[1]/tbody[1]/tr[11]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
     WebElement deductionpage;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtName\"]")
	WebElement name1;
	
	@FindBy(xpath ="/html/body/form/ul[1]/li")
	WebElement nameclick;
	
	@FindBy(xpath = "//select[@id=\"ctl00_contentPlaceHolderBody_ddlSection\"]")
	WebElement sestion;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtAmountOfPayment\"]")
	WebElement amount;
	
	 @FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtCreditedDate\"]")
	 WebElement date1;
	 
	 @FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtTaxDedDate\"]")
	 WebElement dateclick;
	 
	 @FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]")
	 WebElement save;
	 
	 
	 
	 
	 
	
	 public DeductionPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public ChallanPage deeeeee(String name,String section,String tds,String date  ) throws Exception {
		 Actions action=new Actions(driver);
		 action.moveToElement(form26q).build().perform();
		 Thread.sleep(2000);
		 action.moveToElement(quartor1).build().perform();
		 Thread.sleep(2000);
		 action.moveToElement(deductionpage).build().perform();
		 Thread.sleep(2000);
		 deductionpage.click();
		 Thread.sleep(2000);
		 name1.sendKeys(name);
		 Thread.sleep(2000);
		 nameclick.click();
		 Thread.sleep(2000);
		 sestion.sendKeys(section);
		 Thread.sleep(2000);
		 amount.sendKeys(tds);
		 Thread.sleep(2000);
		 date1.sendKeys(date);
		 Thread.sleep(2000);
		 dateclick.click();
		 Thread.sleep(2000);
		 save.click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(4000);
		return new ChallanPage();
		 
	 }
}
	

