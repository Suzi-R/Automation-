package com.application.test;

import java.awt.AWTException;
import java.io.IOException;

import org.sikuli.script.FindFailed;

import jxl.JXLException;
import jxl.read.biff.BiffException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException, FindFailed, BiffException {
		// TODO Auto-generated method stub
		
		
		MR mr1 = new MR();
		
      //mr1.browserMercuryAppLaunch();//
      //mr1.loginDataDrivenExcelSheet();//
     
      //mr1.loginSikuli();//
    //mr1.loginMercury();//
      //mr1.selectCity();//
      // //mr1.RightClickAction();//
     //mr1.loginSikuli();//
		//mr1.scrollDown();//
		//mr1.DragAndDropAction();//
//mr1.loginImplicitWait();//
      //mr1.loginExplicite();//
      //mr1.loginSikuli();//
      //mr1.autoITTest();//
		//mr1.frameHandling();//
		//mr1.browserFacebookAppLaunch();//
		//mr1.loginwithPropertyFile();//
    //mr1.loginMercuryWithParameter("suzidasd", "roydasd");//
		//mr1.browserOrangeHRMlaunch();//
		//mr1.loginOrangeHRM();//
		//mr1.clickLeave();//
		//mr1.clickPIM();//
	
	
		
		//mr1.selectLeaveList();//
		//mr1.LeaveStatus();//
		//mr1.loginDataDrivenExcelSheet();//
		ExcelLogin DR= new ExcelLogin();
		DR.browserFacebookAppLaunch();
		DR.loginDataDrivenExcelSheet();
		
      
      
		
	}
}


	

