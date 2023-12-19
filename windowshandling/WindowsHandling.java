package homeAssignment.windowshandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Merge Contacts")).click();
    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    List<String> listName=new ArrayList<String>(windowHandles);//pass the parameter
    driver.switchTo().window(listName.get(1));

    driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
    driver.switchTo().window(listName.get(0));
    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
    
    Set<String> windowHandles2 = driver.getWindowHandles();
    List<String> listName2=new ArrayList<String>(windowHandles2);//pass the parameter
    driver.switchTo().window(listName2.get(1));
    
    
    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
    driver.switchTo().window(listName2.get(0));
    
    driver.findElement(By.linkText("Merge")).click();
    
    Alert alert = driver.switchTo().alert();//ctrl+2+l
	//verification to get the text from the pop up
	
	alert.accept();
	
	
	System.out.println("The title of the page is : " +driver.getTitle());
    
    
    
    
    
    
    
    
    
    
    
    
}
}
