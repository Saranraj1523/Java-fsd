package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		//laungh webdriver
		ChromeDriver driver = new ChromeDriver();
		//max-window
		driver.manage().window().maximize();
		//loding the web page
		driver.get("https://letcode.in/");
		System.out.println("page is opened");
				
		Thread.sleep(3000);
		//click signup button
		driver.findElementByLinkText("Log in").click();
		
		Thread.sleep(3000);
		//enter email
		driver.findElementByName("email").sendKeys("saranmalvoi8531@gmail.com");
		
		Thread.sleep(3000);
		//enter password
		driver.findElementByName("password").sendKeys("saran123");
		
		Thread.sleep(3000);
		//click login btn
		driver.findElementByXPath("//button[.='LOGIN']").click();
		
		//close the tap
		Thread.sleep(3000);
		driver.quit();
	}

}
