package week4.assignment1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("Bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	

	boolean enable=driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).isEnabled();
	System.out.println(enable);
	
	String count = driver.findElement(By.xpath("//strong[text()=' Items Found']")).getText();
	System.out.println(count);



	List<WebElement> brandNames = 	driver.findElements(By.xpath("//div[@class='brand']"));
	List <String> newList=new ArrayList<String>();
	for (int i = 0; i <brandNames.size(); i++) {
	String values=	brandNames.get(i).getText();
				newList.add(values);
				
	}
	System.out.println(newList);

	List<WebElement> bagNames=driver.findElements(By.xpath("//div[@class='nameCls']"));
	List <String> newList2=new ArrayList<String>();
	for (int j = 0; j < bagNames.size(); j++) {
		String names = bagNames.get(j).getText();
		newList2.add(names);
		
	}
	System.out.println(newList2);
}
}
