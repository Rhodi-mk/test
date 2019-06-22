
package autotest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailChecker {
    public static void main(String[] args) throws InterruptedException {
//  new instance of the  driver
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
WebDriver driver;
driver = new FirefoxDriver();
//the site
String url=("https://accounts.google.com/signin");
driver.get(url); 
// log in message 
System.out.println("Successfully opened ");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']")); 
email_phone.sendKeys("0911843854"); 
driver.findElement(By.id("identifierNext")).click(); 
WebElement password = driver.findElement(By.xpath("//input[@name='password']")); 
WebDriverWait wait = new WebDriverWait(driver, 20); 
wait.until(ExpectedConditions.elementToBeClickable(password));
password.sendKeys("Lehayme1"); 
driver.findElement(By.id("passwordNext")).click();
 List<WebElement> unreademail = driver.findElements(By.className("zE"));
        System.out.println("Total No. of Unread Mails: " + unreademail.size());
}
    
}
