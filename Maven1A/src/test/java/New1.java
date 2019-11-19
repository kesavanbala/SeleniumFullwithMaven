import java.awt.List;
import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class New1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kesavan B\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(by.)
		WebElement	e1=driver.findElement(By.id("u_0_m"));
		Select s=new Select(e1);
		Actions a=new Actions(driver);
		Set<String> rs=driver.getWindowHandles();
		Iterator<String> it=rs.iterator();
		String i=it.next();
		String j=it.next();
		
		
		
		
		
		
		
		
		
		
		
//		java.util.List<WebElement> l=s.getOptions();
//		for(WebElement s1:l)
//		{
//			System.out.println(s1.getText());
//		}
		
//		Actions a=new Actions(driver);
//		a.moveToElement(e1).click().keyDown(Keys.SHIFT).sendKeys("kesav").contextClick().build().perform();
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		WebDriverWait ww=new WebDriverWait(driver,20);
//		ww.until(ExpectedConditions.textToBePresentInElement(e1, "text"));
//		Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
//				.withTimeout(20, SECONDS)
//				.pollingEvery(2, SECONDS);
//		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(30, TimeUnit.SECONDS)
//			       .pollingEvery(5, TimeUnit.SECONDS)
//			       .ignoring(NoSuchElementException.class);
//			 		
//		
//			   WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
//				     public WebElement apply(WebDriver driver) {
//				       return driver.findElement(By.id("foo"));
//				     } 
//				   });
//		
//		Set<String> s=driver.getWindowHandles();
//		Iterator<String> i=s.iterator();
//		 String w1=i.next();
//		 driver.switchTo().window(w1);		
//		 
//		 driver.switchTo().alert().getText();
//		 
//		 driver.switchTo().frame(index);
//		
//		EventFiringWebDriver ef=new EventFiringWebDriver(driver);
//		File src=ef.getScreenshotAs(OutputType.FILE);
//		File dst=new File("C://kes.PNG");
//		FileUtils.C
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		ts.getScreenshotAs(OutputType.FILE);
		
	
		
	}

}
