package project_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class New {
	@DataProvider(name="loginData")
	public Object[][] logindata(){
		return new Object[][] {
			{"student","Password123"},
			{"incorrectUser","Password123"},
			{"student","luci@123"}
		};
	}
	@Test(dataProvider ="loginData")
	public void login(String uname,String pass) {
		LoginPage lp = new LoginPage();
		lp.start();
		lp.getUname().sendKeys(uname);
		lp.getPass().sendKeys(pass);
		lp.getLoginBtn().click();
		lp.tearDown();
	}
	
}


/*	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\project_new\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		WebElement signIn = driver.findElement(By.xpath("//button[@id='submit']"));
		signIn.click();
		String url = "https://practicetestautomation.com/logged-in-successfully/";
		System.out.println(url.equals(driver.getCurrentUrl()));
		System.out.println();
		String org_text ="Logged In Successfully";
		String text = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
		System.out.println(text.equals(org_text));
		WebElement logOut = driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
		logOut.click();
*/