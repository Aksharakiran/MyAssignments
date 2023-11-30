package week2.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select drop1 = new Select(source);
        
        drop1.selectByIndex(3);
        
        WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select drop2 = new Select(marketing);
        
        drop2.selectByVisibleText("Automobile");
        WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select drop3 = new Select(industry);
        
        drop3.selectByValue("IND_SOFTWARE");
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select drop4 = new Select(ownership);
        
        drop4.selectByIndex(3);


        
	}

}
