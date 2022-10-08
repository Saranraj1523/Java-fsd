package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

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
		driver.findElementByLinkText("Sign up").click();
		
		Thread.sleep(3000);
		//entern name
		driver.findElementById("name").sendKeys("SARANRAJ V");
		
		Thread.sleep(3000);
		//enter email
		driver.findElementById("email").sendKeys("saranmalvoi8531@gmail.com");
		Thread.sleep(3000);
		//enter password
		driver.findElementById("pass").sendKeys("saran123");
		Thread.sleep(3000);
		//checkbox
		driver.findElementById("agree").click();
		Thread.sleep(3000);
		//SIGN UP
		driver.findElementByXPath("//button[.='SIGN UP']").click();
		
		//close the tap
//		Thread.sleep(3000);
//		driver.quit();
		
		
		

	}

}
