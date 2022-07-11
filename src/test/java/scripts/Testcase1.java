package scripts;



import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillaryLoginPage;
import PomPages.SkillraryDemoLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		
		driverutilies.switchtoabs(driver);
		
		
		driverutilies.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtocartPage a=new AddtocartPage(driver);
		driverutilies.doubleclick(driver, a.getAddbtn());
		a.adddtocartbtn();
		driverutilies.alertpopup(driver);
	}

}
