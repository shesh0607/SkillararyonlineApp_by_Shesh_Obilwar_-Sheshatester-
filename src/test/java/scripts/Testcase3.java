package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.Addtowishlist;
import PomPages.CorejavaPage;
import PomPages.SkillaryLoginPage;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.searchtb(pdata.getPropertyfile("coursename"));
		s.searchbtn();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		Addtowishlist a=new Addtowishlist(driver);
		a.acceptbutton();
		driverutilies.switchtoframe(driver);
		a.playbutton();
		Thread.sleep(8000);
		a.pausebutton();
		driverutilies.switchback(driver);
		a.addtowishlist();
	}

}
