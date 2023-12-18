package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonApp {
		public static void main(String[] args) {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com.au/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
			driver.findElement(By.xpath("//span[text()='oys']")).click();
		String total=driver.findElement(By.xpath("//span[text()='1-48 of over 70,000 results for']")).getText();
	System.out.println(total+" Bags for boys");
	driver.findElement(By.xpath("//li[@id='p_89/Bansusu']/span[1]/a[1]/span[1]")).click();
	driver.findElement(By.className("a-dropdown-prompt")).click();
	driver.findElement(By.id("s-result-sort-select_4")).click();
	String name=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
	System.out.println("Name of the bag : " +name);
	String amount=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("Amount is :" +amount);
	System.out.println("Page Title is :" +driver.getTitle());
		
		}

}
