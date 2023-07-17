
package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	@FindBy(id="add")
	private WebElement addbtn;

@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement addtocart;
  
public AddtocartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void adddtocartbtn() {
	addtocart.click();
}

public WebElement getAddbtn() {
	return addbtn;
}

}
