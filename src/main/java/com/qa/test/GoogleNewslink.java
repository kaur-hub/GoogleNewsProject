package com.qa.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleNewslink {

	WebDriver driver;
	
	
    @Test(priority=1)
    public void launchApplication(){
	System.setProperty("webdriver.chrome.driver","C://Users//sukhd//OneDrive//Desktop//chromedriver_win32 (3)//chromedriver.exe");
	 driver = new ChromeDriver();
			driver.get("https://news.google.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@class='Ax4B8 ZAGvjd']")).sendKeys("nobel prize");
			driver.findElement(By.xpath("//header/div[2]/div[2]/div[1]/form[1]/button[4]/*[1]")).click();}  
    
    
    
   @Test(priority=2)
    public void selectLinks() throws Exception{
	     Thread.sleep(5000);
	  
		List<WebElement> list = driver.findElements(By.xpath("(//main[@class='HKt8rc CGNRMc'])[2]//h3/a"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
		System.out.println(list.size());
		for( int i=0;i<2;i++){
			
			System.out.println(list.get(i).getText());
			}
	   
	   
   }

}
