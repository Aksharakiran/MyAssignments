package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.pvrcinemas.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
	
	driver.findElement(By.xpath("//i[@class='icon-bar icon']/following-sibling::i")).click();
	driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
	
	 WebElement genre = driver.findElement(By.name("genre"));
     Select drop1 = new Select(genre);
     
     drop1.selectByVisibleText("ANIMATION");
     WebElement language = driver.findElement(By.name("lang"));
     Select drop2 = new Select(language);
     
     drop2.selectByVisibleText("ENGLISH");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//button[text()='Apply']")).click();
     Thread.sleep(5000);
  String text=   driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).getText();
   System.out.println("Movie Name :"+text);
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//select[contains(@class,'input-text form-control')]")).click();
   WebElement cinemaName=  driver.findElement(By.name("cinemaName"));
   Select drop3=new Select(cinemaName);
   drop3.selectByIndex(2);
  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Akshara",Keys.ENTER);
  driver.findElement(By.name("mobile")).sendKeys("9566210020",Keys.ENTER);
  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Akshara",Keys.ENTER);
  driver.findElement(By.name("mobile")).sendKeys("9566210020",Keys.ENTER);
  
}
}
