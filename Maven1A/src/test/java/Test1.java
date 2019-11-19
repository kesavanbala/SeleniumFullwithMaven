import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\MY COMPUTER\\Do_not_Delete\\new install\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI58n5oqiY5AIV1IRwCh1UcwLYEAAYASAAEgLsR_D_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		//div[@id="rb-calendar_onward_cal"]/table/tbody/tr[1]
		int a=ele.size();
		System.out.println(a);
		List<WebElement> c=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td"));
		int b=c.size();
		System.out.println(b);
		String before="//div[@id='rb-calendar_onward_cal']/table/tbody/tr[";
		String after="]/td[";
		String end="]";
		
		
		for(int i=3;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				String s=driver.findElement(By.xpath(before+i+after+j+end)).getText();
				System.out.println(s);
				if(s.equals("25"))
				{
					driver.findElement(By.xpath(before+i+after+j+end)).click();
				}
			}
		}
		
	}

}
