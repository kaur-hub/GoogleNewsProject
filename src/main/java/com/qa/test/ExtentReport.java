package com.qa.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {

	
	  public  ExtentReports reports;
	  public  ExtentTest logger;

	@BeforeSuite

	// initializing extent report
	public void propertyExtentSetup()  {
      // extent report
		String filename = new SimpleDateFormat("'student_'yyyyMMddHHmmSS'.html'").format(new Date());
		
		String path = "C:\\Users\\sukhd\\eclipse-workspace\\GoogleNewsProject\\target\\GoogleNews_extent"+filename;
		reports = new ExtentReports(path);}
		
		@AfterSuite
		public void close() {
	
		reports.endTest(logger);
		reports.flush();
	}
}
