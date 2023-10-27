package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_Library.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();// bussiness library of gears from SkillraryHomePage
		s.getSkillrarydemoapp();// bussiness library of SkillraryDemoApp from SkillraryHomePage
		utilities.childBrowser(driver);
		DemoSkillraryPage ds = new DemoSkillraryPage(driver);
		ds.getFeedBckBtn();// bussiness library of feedBackButton from SkillraryHomePage
		DownloadInvoicePage dI = new DownloadInvoicePage(driver);
		dI.downloadInvoiceButton();// bussiness library of downloadInvoiceButton from downloadInvoicePage
		
	}
}
