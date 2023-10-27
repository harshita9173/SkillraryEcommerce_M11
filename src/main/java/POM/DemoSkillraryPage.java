package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	//Declaration
	//address of select Category
		@FindBy(name="addresstype")
		private WebElement selectDd;
	//address of feedback button
		@FindBy(xpath="//a[text()='FEEDBACK']")
		private WebElement feedBckBtn;	
	//initialization
		public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//Utilization
		public WebElement getSelectDd() {
			return selectDd;
		}
		public WebElement getFeedBckBtn() {
			return feedBckBtn;
		}
	//Bussiness Libraries
		public void feedBackButton() {
			feedBckBtn.click();
		}
}
