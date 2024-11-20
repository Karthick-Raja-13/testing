package project_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Mail {
@Test
public void sendReport() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\automation2\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/servicelogin?service=mail");
	driver.findElement(By.name("identifier")).sendKeys("karthickzenjade@gmail.com");
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Screen scr = new Screen();
}
}
