package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class MasterNonEmp extends Base{
	
	@FindBy(xpath = "//a[normalize-space()=\"Masters\"]")
	WebElement master;
	
	@FindBy(xpath = "//a[normalize-space()=\"Deductee (Non Employee)\"]")
	WebElement nonemp;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtNonEmployeeName\"]")
	WebElement name1;
	
	@FindBy(xpath = "//select[@id=\"ctl00_contentPlaceHolderBody_cmbState\"]")
	WebElement state1;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtReferenceNo\"]")
	WebElement custmerid1;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtPanReference\"]")
	WebElement pan1;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]")
	WebElement save;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_btnShowAll\"]")
	WebElement showall;
	
	public MasterNonEmp() {
		PageFactory.initElements(driver, this);
	}
	
	public DeductionPage masteeeee(String name,String state,String custmerid,String pan) throws Exception {
		Actions action=new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(2000);
		action.moveToElement(nonemp).build().perform();
		Thread.sleep(2000);
		nonemp.click();
		Thread.sleep(2000);
		name1.sendKeys(name);
		Thread.sleep(2000);
		state1.sendKeys(state);
		Thread.sleep(2000);
		custmerid1.sendKeys(custmerid);
		Thread.sleep(4000);
		pan1.sendKeys(pan);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		showall.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		return new DeductionPage();
		
	}



}
