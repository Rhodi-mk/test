
package autotest;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class PortalChecker {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get("https://portal.aait.edu.et/");

        System.out.println("Successfully opened the website localhost");

        driver.findElement(By.id("UserName")).sendKeys("ATE/5203/09");
        driver.findElement(By.id("Password")).sendKeys("7223");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div[2]/div[2]/form/div[4]/div/button")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();
        // driver.findElement(By.id("m12")).click();

        String output = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
        // File DestFile= new File("Desktop/grade.doc");

        try {
            FileWriter aa = new FileWriter("grade.doc");
            aa.write(output);
            aa.close();
        }catch(IOException e){
            
            
        }
    }}
