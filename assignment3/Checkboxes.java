package week2.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//driver.findElement(By.xpath("//input[@value='java']")).click();
		//driver.findElement(By.xpath("//input[@value='py']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Java')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Python')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Javascript')]")).click();
		
		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		//driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c ')]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[8]")).click();
/*WebElement element=driver.findElement(By.xpath("//div[contains(@class,ui-selectbooleancheckbox ui-chkbox ui-widget ')])[3]"));
String text =element.getText();
if(text.equalsIgnoreCase("checkbox ")) {
	System.out.println("Check box is disabled" +text);
}
	
WebElement source = driver.findElement(By.id(""));
Select drop1 = new Select(source);
*/

driver.findElement(By.xpath("//div[contains(@class,'selectcheckboxmenu')]")).click();
//driver.findElement(By.xpath("//input[@type='checkbox'][@value='Miami']")).click();
driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box ')])[11]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box ')])[14]")).click();



	}
	
}