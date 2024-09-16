package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
WebDriver driver;
public void start() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\project_new\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
}
public WebElement getUname() {
	return driver.findElement(By.xpath("//input[@id='username']")); 
}
public WebElement getPass() {
	return driver.findElement(By.xpath("//input[@id='password']"));
}
public WebElement getLoginBtn() {
	return driver.findElement(By.xpath("//button[@id='submit']"));
}
public void tearDown() {
	driver.quit();
}
}


// Newly inserted Text Hello 
