package com.application.test;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MR {
	static WebDriver driver;



// ===============================================================================



/*  

 *  Browser launch and application launch 

 */

public void browserMercuryAppLaunch() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

    driver = new ChromeDriver();

    Thread.sleep(3000);

    driver.manage().window().maximize();

    Thread.sleep(3000);

    driver.get("http://newtours.demoaut.com/");

    Thread.sleep(3000);

    //driver.close();

}
/*

 * Simple login process with xpath locator

 */

public void loginMercury() throws IOException, InterruptedException {

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    

    //WebElement uName = driver.findElement(By.name("userName"));

    uName.sendKeys("dasd");

    Thread.sleep(3000);

    

    WebElement pwd = driver.findElement(By.name("password"));

    pwd.sendKeys("dasd");

    Thread.sleep(3000);

    

    WebElement login = driver.findElement(By.name("login"));

    login.click();

}


/*

 * Verify Login


 */

public void verifyLogin()

{

    String expTitle = "Find a Flight: Mercury Tours:";

    String actTitle = driver.getTitle();

    

    System.out.println("System returns the page title: "+ actTitle);

    

    if(actTitle.equals(expTitle))

    {

        System.out.println("Test case passed");

    }

    else

    {

        System.out.println("Test case failed");

    }

    

}










public void DoubleClickAction() {

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    uName.sendKeys("dasd");



    WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

    pwd.sendKeys("dasd");



    WebElement Dlogin = driver.findElement(By.xpath("//input[@value='Login']"));



    Actions builder = new Actions(driver);



    builder.moveToElement(Dlogin).build().perform();



    builder.click(Dlogin).build().perform();

}




public void selectCity() throws InterruptedException

{

    WebElement ArriveIn = driver.findElement(By.name("toPort"));
    WebElement onMonth = driver.findElement(By.name("fromMonth"));
    WebElement onDay = driver.findElement(By.name("fromDay"));
    
    

    //Select sel = new Select(ArriveIn);//
    Select sel1=new Select(onMonth);
    Select sel2=new Select(onDay);
    Thread.sleep(4000);

    //sel.selectByIndex(7);//
    sel1.selectByIndex(6);
    sel2.selectByValue("14");
    

    

}

public void ContineuclickAction() {





    WebElement Continue= driver.findElement(By.xpath("//input[@name='findFlights']"));



    Actions builder = new Actions(driver);



    builder.moveToElement(Continue).build().perform();



    builder.click(Continue).build().perform();

}


public void RightClickAction() {

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    uName.sendKeys("dasd");



    WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

    pwd.sendKeys("dasd");



    WebElement Rlogin = driver.findElement(By.xpath("//input[@value='Login']"));



    Actions builder = new Actions(driver);



    builder.moveToElement(Rlogin).build().perform();



    builder.contextClick(Rlogin).build().perform();

}

/*

 * Login with Sikuli [Image identification will take place instead of Object]

 */







public void browsertoolsqaAppLaunch() throws InterruptedException  {

    System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

    driver = new ChromeDriver();

    Thread.sleep(3000);

    driver.manage().window().maximize();

    Thread.sleep(3000);

    driver.get("http://toolsqa.com/iframe-practice-page/");

    Thread.sleep(3000);

    //driver.close();

}



public void scrollDown() throws InterruptedException

{

           System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

       driver = new ChromeDriver();

       driver.manage().window().fullscreen();

       driver.get("http://toolsqa.com/iframe-practice-page/");

       Thread.sleep(6000);        

       JavascriptExecutor js = (JavascriptExecutor) driver;

       js.executeScript("window.scrollBy(0, 6000)");
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,-6000)");
       


       Thread.sleep(9000);                         

}

                       



public void loginSikuli() throws FindFailed {

	 

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    uName.sendKeys("dasd");

    WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

    pwd.sendKeys("dasd");

    Screen screen = new Screen();

    Pattern btnLogin = new Pattern("./Sikulifiles/Login2.PNG");

    screen.click(btnLogin);

}


public void DragAndDropAction()throws InterruptedException {
 {
	WebElement src = driver.findElement(By.xpath("//input[@name='userName']"));

WebElement dest = driver.findElement(By.xpath("//input[@name='password']"));
  	
  	Actions builder4 = new Actions(driver);
  	builder4.dragAndDrop(src, dest).build().perform();
}
}
	



/*

 * Login with Explicit Wait

 */

public void loginExplicite() throws InterruptedException {

      new WebDriverWait(driver, 10)

                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='userName']")));

     

      WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

      uName.sendKeys("dasd");

     

      new WebDriverWait(driver, 10)

                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));



      WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

      pwd.sendKeys("dasd");



      new WebDriverWait(driver, 10)

                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Login']")));



      WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));

      login.click();

}

/*

 * Login with ImplicitWait

 */

public void loginImplicitWait() throws InterruptedException {

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

      uName.sendKeys("dasd");

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

      pwd.sendKeys("dasd");

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));

      login.click();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


//================================================================================



/*

 * Photo Upload with AutoIT

 */

public void autoITTest1() throws InterruptedException, IOException {

   System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

     driver = new ChromeDriver();

     
     driver.get("https://imgbb.com/");

     Thread.sleep(4000);

     WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));

     btnStartUpload.click();

     Thread.sleep(6000);

     Runtime.getRuntime().exec("./autoitexe/Fileupload.exe");

     Thread.sleep(6000);

     WebElement btnUpload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));

     btnUpload.click();

     Thread.sleep(5000);
}





public void frameHandling() throws InterruptedException {

   

        System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

         driver = new ChromeDriver();

         driver.manage().window().fullscreen();

    driver.get("http://demo.guru99.com/test/guru99home/");

    Thread.sleep(6000);

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("window.scrollBy(0,2300)");

    Thread.sleep(6000); 

    driver.switchTo().frame("a077aa5e");

    Thread.sleep(4000);

    WebElement linkbtn = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));

    linkbtn.click();

    driver.switchTo().defaultContent();
}








public void autoITTest() throws InterruptedException, IOException {

    System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

    driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://imge.to/");

    Thread.sleep(4000);

    WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big green']"));

    btnStartUpload.click();

    Thread.sleep(6000);

    Runtime.getRuntime().exec("./autoitexe/Fileupload.exe");
    
    WebElement Image = driver.findElement(By.xpath("//input[@type='checkbox']"));

    

    Actions builder = new Actions(driver);



    builder.moveToElement(Image).build().perform();



    builder.click(Image).build().perform();


    

    Thread.sleep(6000);

    //WebElement btnUpload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));

    //btnUpload.click();//

    Thread.sleep(5000);//
}


public void browserFacebookAppLaunch() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

    driver = new ChromeDriver();

    Thread.sleep(3000);

    driver.manage().window().maximize();

    Thread.sleep(3000);

    driver.get("https://www.facebook.com/");

    Thread.sleep(3000);

}




/*
 *login with property File Data
 */
public void loginwithPropertyFile() throws IOException, InterruptedException {
	File file = new File ("./testdata/testdata.properties");
	FileInputStream fileInput = new FileInputStream(file);
	Properties prop =new Properties();
	prop.load(fileInput);
	Thread.sleep(3000);
	 WebElement uName = driver.findElement(By.xpath("//input[@name='email']"));
uName.sendKeys(prop.getProperty("Username"));
Thread.sleep(3000);

	    WebElement pwd = driver.findElement(By.name("pass"));

	    pwd.sendKeys (prop.getProperty("Password"));

	    Thread.sleep(3000);
	    WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));

	    login.click();
	}




public void loginMercury1() throws IOException, InterruptedException {

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    

    //WebElement uName = driver.findElement(By.name("userName"));

    uName.sendKeys("dasd");

    Thread.sleep(3000);

    

    WebElement pwd = driver.findElement(By.name("password"));

    pwd.sendKeys("dasd");

    Thread.sleep(3000);

    

    WebElement login = driver.findElement(By.name("login"));

    login.click();

}





public void loginMercuryWithParameter(String uname, String password) throws IOException, InterruptedException {

    

    WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

    uName.sendKeys(uname);

    WebElement pwd = driver.findElement(By.name("password"));    

    pwd.sendKeys(password);

    WebElement login = driver.findElement(By.name("login"));

    login.click();

    Thread.sleep(3000);
    
    
}




/*

 * Data Driven Login testing with Excel

 */

public void loginDataDrivenExcelSheet() throws BiffException, IOException, InterruptedException {

                File src = new File("./testdata/exceldata.xls");

                Workbook wb = Workbook.getWorkbook(src);

                Sheet sh1 = wb.getSheet("login");



                int rows = sh1.getRows();



                for (int i = 1; i < rows; i++) {

                                String userNameDataFromExcel = sh1.getCell(0, i).getContents();

                                String passwordDataFromExcel = sh1.getCell(1, i).getContents();



                                Thread.sleep(2000);



                                WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));

                                uName.sendKeys(userNameDataFromExcel);

                                Thread.sleep(2000);



                                WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

                                pwd.sendKeys(passwordDataFromExcel);

                                Thread.sleep(2000);



                                WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));

                                login.click();

                                Thread.sleep(5000);
                                
                                
                                



                                WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));

                                home.click();

                                Thread.sleep(5000);



                }

}


public void browserOrangeHRMlaunch() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");

    driver = new ChromeDriver();

    Thread.sleep(3000);

    driver.manage().window().maximize();

    Thread.sleep(3000);

    driver.get("https://opensource-demo.orangehrmlive.com/");

    Thread.sleep(3000);

    //driver.close();

}



public void loginOrangeHRM() throws IOException, InterruptedException {

    WebElement uName = driver.findElement(By.xpath("//input[@id='txtUsername']"));

    

    //WebElement uName = driver.findElement(By.name("userName"));

    uName.sendKeys("Admin");

    Thread.sleep(3000);

    

    WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));

    pwd.sendKeys("admin123");

    Thread.sleep(3000);

    

    WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));

    login.click();

}





public void clickLeave() throws InterruptedException, AWTException{
  WebElement Leave= driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b"));

   Leave.click();
  
WebElement SubUnit = driver.findElement(By.xpath("//select[@name='leaveList[cmbSubunit]']"));
		Select sel = new Select (SubUnit);
		sel.selectByIndex(2);
		
		
		
		WebElement LeaveFrom = driver.findElement(By.xpath("//*[@id=\"calFromDate\"]"));
		LeaveFrom.clear();
		Thread.sleep(3000);
		LeaveFrom.sendKeys("2019-08-02");
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		
		WebElement LeaveStatus = driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_2\"]"));
		LeaveStatus.click();
		
		
		WebElement Hint= driver.findElement(By.xpath("//*[@id=\"leaveList_txtEmployee_empName\"]"));
		Hint.sendKeys("sudha");
		Select sel3 = new Select (SubUnit);
		sel3.selectByIndex(0);
		Hint.click();
		
		WebElement Past=driver.findElement(By.xpath("//*[@id=\"leaveList_cmbWithTerminated\"]"));
		Past.click();
		WebElement Search=driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
		Search.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

public void clickPIM() throws InterruptedException, AWTException{
	  WebElement PIM= driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b"));
	  PIM.click();
}



public void FacebookloginDataDrivenExcelSheet() throws BiffException, IOException, InterruptedException {

    File src = new File("./testdata/exceldata2.xls");

    Workbook wb = Workbook.getWorkbook(src);

    Sheet sh1 = wb.getSheet("login");



    int rows = sh1.getRows();



    for (int i = 1; i < rows; i++) {

                    String userNameDataFromExcel = sh1.getCell(0, i).getContents();

                    String passwordDataFromExcel = sh1.getCell(1, i).getContents();



                    Thread.sleep(2000);



                    WebElement uName = driver.findElement(By.xpath("//input[@name='email']"));
                    uName.sendKeys(userNameDataFromExcel);
                    

                    Thread.sleep(2000);



                    WebElement pwd = driver.findElement(By.name("pass"));

                    pwd.sendKeys(passwordDataFromExcel);

                    Thread.sleep(2000);



                    WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));


                    login.click();

                    Thread.sleep(5000);
                    
                    
                    



                    WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));

                    home.click();

                    Thread.sleep(5000);



    }
}
}




















