package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillaryLoginPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.TestingPage;
import genericLib.BaseClass;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		driverutilies.switchtoabs(driver);
		driverutilies.dropDown(sd.getDropdown(),pdata.getPropertyfile("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.draganddrop(driver, t.getSelcourse(),t.getCarttab());
	Point loc=t.getFacebook().getLocation();
	int x=loc.getX();
	int y=loc.getY();
		driverutilies.scollbar(driver,x,y);
		t.facebookicon();
	}
	

}
