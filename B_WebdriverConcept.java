package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_WebdriverConcept {
    public static void main(String[] args) {


  // System.setProperty("webdriver.chrome.driver","C:/Software/Driver/Chromedriver.exe");
       WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");




    }
}
