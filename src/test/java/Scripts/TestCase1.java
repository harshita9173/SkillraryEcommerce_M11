package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import generic_Library.BaseClass;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();
		s.getSkillrarydemoapp();
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.dropDowns(ds.getSelectDd(), pdata.getPropertydata("coursedd"));
		TestingPage t=new TestingPage(driver);
		utilities.Scrolling(driver, t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();
	}
}
