package project_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliTest {
@Test
public void test1() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\project_new\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	Screen scr = new Screen();
	Pattern desktop = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\project_new\\src\\test\\resources\\images\\Screenshot 2024-07-27 141123.png"); 
	Pattern mac = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\project_new\\src\\test\\resources\\images\\Screenshot 2024-07-27 141517.png");
	scr.wait(desktop,5);
	scr.wait(mac,5);
	scr.click(desktop);
	scr.click(mac);
}
}
