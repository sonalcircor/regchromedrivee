package homework;




import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.Element;

    public class register_hwedge extends selectvalue{
        public static void selectValueFromDropDown(WebElement element, String value) {
            //private WebElement Element;
            Select select = new Select(element);
            select.selectByVisibleText(value);
        }

        public static void main(String[] args) throws InterruptedException{
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
            driver.findElement(By.id("FirstName")).sendKeys("Sonal");
            Thread.sleep(2000);
            driver.findElement(By.id("LastName")).sendKeys("Patel");
            Thread.sleep(2000);
            // driver.findElement(By.name("Date of birth:")).sendKeys("02");
            // /html/body
            // WebElement day = driver.findElement(By.name("WebElement day = driver.findElement(By.name(\"Date of birth:\"));"));
            WebElement day = driver.findElement(By.name("DateOfBirthDay"));
            WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
            WebElement year = driver.findElement(By.name("DateOfBirthYear"));

            Select select = new Select(day);
            select.selectByIndex(20);
            Select select1 = new Select(month);
            select1.selectByVisibleText("August");
            Select select2 = new Select(year);
            select2.selectByValue("1983");

            driver.findElement(By.id("Email")).sendKeys("tina_sonal@yahoo.co.in");
            driver.findElement(By.name("Company")).sendKeys("Unify");
            //  driver.findElement(By.id("Newsletter:")).isSelected();
            driver.findElement(By.id("Password")).sendKeys("S12345");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("S12345");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
            //driver.close();
        }
        // public static void SelectValueFromDropDown(WebElement element, String Value){
        //   Select select = new Select(element);
        //   select.selectByVisibleText(Value);
        //}
    }



