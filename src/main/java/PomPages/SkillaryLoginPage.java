package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	
	
	public SkillaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void gearsbutton() {
		gearbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchtb(String name) {
		searchtb.sendKeys(name);
	}
	public void searchbtn() {
		gobtn.click();
	}
	


}

