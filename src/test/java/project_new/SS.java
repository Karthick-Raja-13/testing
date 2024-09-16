package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SS {
@Test(invocationCount=3)
public void selectDropDown() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\new\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement el = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	Select select = new Select(el);
	select.selectByVisibleText("India");
	driver.quit();
	/*
	 * TakesScreenshot ts = (TakesScreenshot)driver;
	
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File StoragePath = new File("C:\\Users\\Admin\\eclipse-workspace\\project_new\\src\\newss.png");
	FileHandler.copy(screenshot, StoragePath);
	WebElement 
	 */
}
}
