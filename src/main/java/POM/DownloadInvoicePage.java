package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	//Declaration
	//address of download Invoice
		@FindBy(xpath="//input[@value='Download Invoice']")
		private WebElement downloadInvoiceBtn;
	//initialization
		public DownloadInvoicePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//Utilization
		public WebElement getDownloadInvoiceBtn() {
			return downloadInvoiceBtn;
		}
	//Bussiness libraries
		public void downloadInvoiceButton() {
			downloadInvoiceBtn.click();
		}
}
