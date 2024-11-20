package bdd;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robo {
@Test
public void start() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\new\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://zenjadeautomation.com/software/");
	Robot rbt = new Robot();
	for (int i = 0;i<10;i++) {
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
	}
	
	Thread.sleep(Duration.ofSeconds(3));
	rbt.mouseMove(100,100);
	rbt.mousePress(0);
	
}
}
