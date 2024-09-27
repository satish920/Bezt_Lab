package Automation_Script;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	 
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	    driver.get("https://sg-app.abouv.com/welcome");
	   
	    driver.findElement(By.linkText("Sign up")).click();
	    
	    driver.findElement(By.xpath("//button[@class='text-white border border-[#014455] rounded-lg flex items-center justify-center w-full py-[12px] font-medium text-[16px]']")).click();
	
	    driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9014798352");
	
	    driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div/button")).click();
	
	    WebDriverWait wait = new WebDriverWait(driver,15);
	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	    button.click();

	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("9");
	
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("0");

	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("4");

	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("6");

	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	    driver.findElement(By.xpath("//div[@class='w-5 h-5  addItem-icon']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//div[@class='w-5 h-5  addItem-icon']")).click();
	
	    driver.findElement(By.xpath("//div[@class='w-5 h-5  addItem-icon']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//button[@class='rounded-[8px] items-center justify-center flex font-medium py-3 disabled:opacity-70 w-full bg-alice-blue text-black border border-eagle-green box-border']")).click();
	
	    driver.findElement(By.name("email")).sendKeys("satishgude920@gmail.com");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("6");
	
	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 2']")).sendKeys("4");

	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 3']")).sendKeys("0");

	    driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 4']")).sendKeys("6");

	    driver.findElement(By.xpath("//button[@class=bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.name("firstName")).sendKeys("Satish");
	    
	    driver.findElement(By.name("lastName")).sendKeys("Gude");
	    
	    driver.findElement(By.name("pincode")).sendKeys("531084");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 mainWidth']")).click();
	
	    driver.findElement(By.xpath("//button[@class='disabled:opacity-50 h-auto rounded-lg border p-[16px] gap-[8px] text-[16px] font-medium leading-[24px] text-left border-philippine-silver bg-white text-granite-gray']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] font-medium text-white h-12 disabled:opacity-50 w-full']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//p[@class='mt-[26px] w-full h-[22px] font-semibold leading-[22.43px] text-center text-granite-gray']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full animate-slide-up']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full mt-[76px] mb-[20px]']")).click();
	
	    driver.findElement(By.xpath("//button[class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//button[@class='bg-eagle-green rounded-[8px] items-center justify-center flex font-medium text-white py-3 disabled:opacity-70 w-full']")).click();
	
	    driver.findElement(By.xpath("//button[@class='h-[48px] w-full  flex items-center justify-center rounded-md bg-[#8EC0C6] text-[#014455] font-medium']")).click();
	
	    driver.findElement(By.xpath("//button[@class='h-[48px] duration-150 w-full flex items-center justify-center bg-[#014455] rounded-md text-white font-medium\"']")).click();
	
	    driver.findElement(By.xpath("//button[@class='h-[48px] w-full flex items-center justify-center rounded-md text-[white] font-medium']")).click();
	
	    driver.findElement(By.xpath("//button[@class='text-white border border-[#014455] rounded-xl flex items-center justify-center w-full py-2 font-medium text-lg']")).click();
	
	
	
	
	
	
	
	
	
	
	
	}























}
