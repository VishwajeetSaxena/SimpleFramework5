package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Page;
import Utils.LocalDriverManager;

public class Base {

	public WebDriver driver;
	public Page page;

	@BeforeSuite
	public void initdriver() {
		driver = LocalDriverManager.getDriver();
		page = new Page(driver);
	}
	
	
	
	@Test
	public void method1() {
		driver.get("https://www.google.com");
		page.homepage.test();
	}

	
	@AfterSuite
	void quitDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
