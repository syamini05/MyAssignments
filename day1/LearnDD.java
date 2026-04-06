package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
        driver.get(" http://leaftaps.com/opentaps/"); 
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafs");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yamini");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");   
        WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sel=new Select(sourcedd);
        sel.selectByIndex(5);
        WebElement marketingdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select sel1=new Select(marketingdd);
        sel1.selectByVisibleText("Automobile");
        WebElement ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select sel2=new Select(ownershipdd);
        sel2.selectByValue("OWN_CCORP");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        //driver.close();
     }
}
