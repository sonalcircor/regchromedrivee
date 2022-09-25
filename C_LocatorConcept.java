package homework;


/*
-Everything is a webelements on page
-To interact with each element Automation script required locators

- There are 8 Locators available in selenium

1. ID:
2. ClassName:
3. Xpath
4.CSS Selector
5.LinkText
6.Partial Link Test
7.TagName
8.Full Path
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C_LocatorConcept {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

       // driver.findElements((By.cssSelector("body>d")) )


        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("Sonal@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
       // driver.quit();
    }

}
