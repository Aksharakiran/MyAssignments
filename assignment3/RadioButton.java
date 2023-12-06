package week2.assignment3;

import java.awt.Button;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai'][1]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai'][1]")).click();
		Boolean button =driver.findElement(By.xpath("//label[text()='Chennai'][1]")).isSelected();
		if(button==true) {
			System.out.println("Button is unselected" +button);
		}
		
		else
		{
		
		System.out.println("Button is selected");
		
		}

		
		WebElement e3=driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
				
		if(e3.isEnabled()) {
			System.out.println("Default radio button is selected" );
		}
		else {
			System.out.println("Button not selcted");
		}
	
WebElement element=driver.findElement(By.xpath("(//label[text()='21-40 Years'])"));
if(element.isEnabled()) {
	System.out.println("Age group is selected");
}
else {
	element.click();
}

	}

}
