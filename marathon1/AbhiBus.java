package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai",Keys.ENTER);
	driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore",Keys.ENTER);
	driver.findElement(By.xpath("(//a[contains(@class,'btn active')])[2]")).click();
	WebElement element=driver.findElement(By.xpath("//h5[@class='title']"));
	System.out.println(element.getText());
	driver.findElement(By.xpath("//div[@id='seat-filter-bus-type']/a[4]")).click();
	String no=driver.findElement(By.xpath("//small[text()=' Buses,']")).getText();
	System.out.println(no);
	WebElement element2=driver.findElement(By.xpath("(//div[@class='row bus-seat-info']//small)[2]"));
	System.out.println(element2.getText());
	driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	driver.findElement(By.xpath("//button[@class='seat sleeper'][1]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
	String seat=driver.findElement(By.xpath("(//span[text()='U1'])[2]")).getText();
System.out.println("seat selected is:" +seat);
String fare =driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
System.out.println("Total amount is :"+fare);
System.out.println("Page title is : " + driver.getTitle());
driver.close();
/*Testcase:1 (AbhiBus)
==========
01) Launch Firefox / Chrome / Safari / Edge 
02) Load https://www.abhibus.com/
Add implicitlyWait - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Chennai" in the FROM text box
04) Click the first option from the pop up box
05) Type "Bangalore" in the TO text box
06) Click the first option from the pop up box
07) Select tomorrow's date in the Date field and click on search button
08) Print the name of the first resulting bus (use .getText())
09) Choose SLEEPER in the left menu from Bus Type
10) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
11) Click Show Seats
12) Choose any one Available seat
13) Select the first resulting checkbox from the Boarding Point and Dropping Point
14) Print Seats Selected ,Total Fare
15) Get the Title of the page(use .getTitle())
16) Close the browser*/

}
}
