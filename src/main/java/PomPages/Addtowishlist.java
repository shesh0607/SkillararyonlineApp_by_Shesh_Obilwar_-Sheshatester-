package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlist {
	
	@FindBy(xpath="//button[text()='Accept']")
		private WebElement accept;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlistbtn;
	
	public Addtowishlist(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void acceptbutton() {
		accept.click();
	}
	
	public void playbutton() {
		playicon.click();
	}
	
	public void pausebutton() {
		pauseicon.click();
	}
	public void addtowishlist() {
		addtowishlistbtn.click();
	}
}
