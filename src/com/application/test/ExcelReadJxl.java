package com.application.test;

public class ExcelReadJxl {
	static Webdriver driver;

	public static void main(String[] args)throws BiffException, IOException, InterruptedException 

	{
	  
		System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

	    driver = new ChromeDriver();

	   driver.manage().window().maximize();

	   Thread.sleep(3000);

	   driver.get("http://newtours.demoaut.com/");
	 
	    
	   FileInputStream F1 = new FileInputStream("./TestData/RefsysLogin.xls");
	   
	   Workbook WB = Workbook.getWorkbook(F1);
	 
	   Sheet sh1 = WB.getSheet("TestData");
	 
	   int rows = sh1.getRows();
	   
	   int cols = sh1.getColumns();
	 
	   for(int i=1;i<rows;i++)
	   {
	    for (int c = 0;c < cols-1;c++)
	    {
	     
	    String uname = sh1.getCell(c, i).getContents();
	    
	  
	    Thread.sleep(2000);
	  
	    WebElement Username = driver.findElement(By.xpath(("//input[@name='userName']")));
	    Username.sendKeys(uname);
	    System.out.println(uname);
	    
	    
	    String PWD = sh1.getCell(c+1, i).getContents();
	    
	    WebElement Password = driver.findElement(By.xpath(("//input[@name= 'password']")));
	    Password.sendKeys(PWD);
	    System.out.println(PWD);
	    Thread.sleep(2000);
	    
	     
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	        
	        
	    driver.navigate().back();
	    
	    WebElement Username1 = driver.findElement(By.xpath(("//input[@name='userName']")));
	    
	    Username1.clear();
	    
	    }
	        
	     } 
	 
	}
	}

}
