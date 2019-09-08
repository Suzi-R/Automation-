package com.application.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	
	static WebDriver driver;



	// ===============================================================================


	

	public void GmailLaunch() throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

	    driver = new ChromeDriver();

	    Thread.sleep(3000);

	    driver.manage().window().maximize();

	    Thread.sleep(3000);

	    driver.get("http://newtours.demoaut.com/");

	    Thread.sleep(3000);

	    //driver.close();


}
}
