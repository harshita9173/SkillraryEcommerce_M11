package generic_Library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//Handle dropDown
	public void dropDowns(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);	
	}
	//Handling Scrolling 
	public void Scrolling(WebDriver driver, WebElement ele) { 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", ele); 
	}
	//Handling MouseOver
	public void mouseOvering(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//Handling RightClick
	public void RightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		}
	//Handling DoubleClick
		public void DoubleClick(WebDriver driver, WebElement ele) {
			Actions a = new Actions(driver);
			a.doubleClick(ele).perform();
		}
	//Handling DragAndDrop
		public void DragAndDrop(WebDriver driver, WebElement ele1,WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2);
		}
	//Handling frame
		public void frames(WebDriver driver,String value) {
		driver.switchTo().frame(value);
		}	
	//Handling default content
		public void frames(WebDriver driver) {
		driver.switchTo().defaultContent();
		}
	//Handling child Browser
		public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
		}
	//Handling PopUp
		public void popup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
	}
}
