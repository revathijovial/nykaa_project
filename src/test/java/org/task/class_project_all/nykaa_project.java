package org.task.class_project_all;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa_project {
	
	public static void nykaa() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    WebElement sign = driver.findElement(By.xpath("//button[text()='Sign in']"));
	    sign.click();
	    
	    WebElement do1 = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
        do1.click();
        
        Thread.sleep(2000);
        
        WebElement phonenumber = driver.findElement(By.xpath("//input[@class='input text-center']"));
        phonenumber.sendKeys("7397513908");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        String str = JOptionPane.showInputDialog("enter your otp");
        
        WebElement otp = driver.findElement(By.xpath("//input[@placeholder='OTP']"));
        otp.click();
        
         otp.sendKeys(str);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
       Thread.sleep(9000);
       
       Actions act = new Actions (driver);
        
       WebElement cat = driver.findElement(By.xpath("//a[text()='categories']"));
       act.moveToElement(cat).build().perform();
	    
       WebElement mak = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
        
        act.moveToElement(mak).build().perform();
        
        driver.findElement(By.xpath("//a[text()='Eyeliner']")).click();
        
        Set<String> hand = driver.getWindowHandles();
        for (String windo : hand) {
        	WebDriver titel = driver.switchTo().window(windo);
        	
			}
        
        js.executeScript("window.scrollBy(0,1000)");
        
        WebElement eyes = driver.findElement(By.xpath("//div[text()='Kay Beauty Quick Dry Liquid Eyeliner']/parent::div/div[2]/span[1]"));
        eyes.click();
        
        Thread.sleep(4000);
        
        Set<String> pro = driver.getWindowHandles();
        for (String eyepro : pro) {
        	WebDriver window = driver.switchTo().window(eyepro);
			
		}
        
        js.executeScript("window.scrollBy(0,500)");
        
        Thread.sleep(3000);
        
        
       //driver.findElement(By.xpath("//div[@class='css-b5dt5q']/div/button[@id='variant_692828']/div/span/img[@alt='Black Canvas-shade']")).click();
        
        Thread.sleep(2000);

        WebElement pincode = driver.findElement(By.xpath("//input[@name='pin code']"));
        pincode.sendKeys("600060");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@class='css-pdkrim']/button[text()='Check']")).click();
        
        Thread.sleep(2000);

       driver.findElement(By.xpath("(//button[@type='button'])[15]/span[text()='Add to Bag']")).click();
       
       driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
       
       Thread.sleep(2000);
       
       WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
       driver.switchTo().frame(frame);

       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("(//span[@class=\"css-1aowomc ehes2bo0\"])[1]")).click();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//div[@class='css-bfwsku']")).click();
       
       driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]")).click();
       
       driver.findElement(By.xpath("//span[@class='css-1aowomc ehes2bo0']")).click();
       WebDriverWait w = new WebDriverWait(driver, 20);
       
       Thread.sleep(3000);
       WebElement pincod = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
      
       act.moveToElement(pincod).build().perform();
       pincod.sendKeys("600060");
       
       
//       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       
       Thread.sleep(3000);
       
       WebElement phn = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
       act.moveToElement(phn).build().perform();
       phn.click();
       //phn.clear();
      // phn.sendKeys("7397513908");
       
       Thread.sleep(3000);
       WebElement code = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
       act.moveToElement(code).build().perform();
       code.sendKeys("13");

       
       Thread.sleep(2000);

       WebElement adds = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
       act.moveToElement(adds).build().perform();
       adds.sendKeys("Metha Nagar, Mehta Nagar, Aminjikarai, Chennai, Tamil Nadu 600029");

       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
       
       System.out.println("Success");
       
	}
	
	public static void main(String[] args) throws Throwable {
		nykaa();
	}

}
