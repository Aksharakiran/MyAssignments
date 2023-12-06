package week2.assignment3;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
		button.click();
		//driver.findElement(By.xpath("//div[contains(@class,'Dashboard ')])
		String actualTitle=driver.getTitle();
		String expectedTitle="Dashboard";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title matched");
			
		}
		else
			System.out.println("Title not matched");
		driver.navigate().back();

		WebElement element=	driver.findElement(By.id("j_idt88:j_idt90"));
		System.out.println("button is disabled "+element.isEnabled());
		WebElement element2=driver.findElement(By.id("j_idt88:j_idt96"));
		System.out.println(element2.getLocation());
		//BUTTON COLOUR
		String buttonColor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
        String buttonTextColor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
        System.out.println("Button color: " + buttonColor);
        System.out.println("Text color " + buttonTextColor);
        //size and width of button
        WebElement element3=driver.findElement(By.id("j_idt88:j_idt98"));
       String value =element3.getAttribute("id");
       System.out.println("The height and width of the button is " +element3.getSize());
       driver.close();
       

					
			
	}
	

}
