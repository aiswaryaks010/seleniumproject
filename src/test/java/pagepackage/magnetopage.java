package pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class magnetopage {

WebDriver driver;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement signin;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")
	WebElement usr;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")
	WebElement pswd;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")
	WebElement signinbutton;
	
	@FindBy(xpath="//span[contains(text(),'Women')]")
	WebElement women;
	
	@FindBy(xpath="//*[@id=\\\"ui-id-5\\\"]/span[2]")
	WebElement men;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]")
	WebElement cart;
	
	
	public void magnetopage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	public void login(String email,String password) throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOfAllElements(signin));
		signin.click();
		usr.sendKeys(email);
		pswd.sendKeys(password);
		signinbutton.click();
	}
	
	public void addproduct()
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			
	        Actions act=new Actions(driver);
	        WebElement wo = women;
      act.moveToElement(wo).perform();
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"ui-id-9\"]")));
      
     WebElement p1= driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
     WebElement p2= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
     WebElement p3= driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]"));
     WebElement p4= driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-57\"]"));
     WebElement p5= driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
     
     p1.click();
     p2.click();
     p3.click();
     p4.click();
     p5.click();
     
     WebElement menmove = men;
     act.moveToElement(menmove).perform();
 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"ui-id-17\"]/span[2]")));
   WebElement m1=  driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]/span[2]"));
   WebElement m2=  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
   WebElement m3= driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]"));
   WebElement m4=  driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]"));
   WebElement m5=  driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
     
     m1.click();
     m2.click();
     m3.click();
     m4.click();
     m5.click();
      
	}
	
	public void cart() throws InterruptedException
	{
	Thread.sleep(2000);
	cart.click();
     
	Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li[1]/div/div/div[3]/div[2]/a")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]/span")).click();   
   driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
	}
	
	
	
	
}
