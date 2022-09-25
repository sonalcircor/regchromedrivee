package homework;


import com.sun.webkit.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

    public static void main(String[] args) {
      //  2. set up the chromedriver - Path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
      // 1.Create an instance of webdriver.
        WebDriver driver = new ChromeDriver();
       // 3. Navigate to WebPage
                driver.get("https://demo.nopcommerce.com/");
        //  4. Get page Title
       System.out.println(driver.getTitle());
       String Title = driver.getTitle();
       System.out.println("Page Title:" +Title);
       //5. Expected vs Actual - Validation
        if (Title.equals("nopCommerce demo store1")){
            System.out.println("Page Title is Correct");
        }else{
            System.out.println("Page Title is incorrect");
        }
        if (Title == "nopCommerce demo store1"){
            System.out.println("Page Title is Correct");

        }else {
            System.out.println("Page Title is Incorrect");
        }
       // 6. Navigatiom

        driver.findElement(By.className("ico-login")).click();

    // Navigation back
    //   driver.navigate().back();

       // Thread.sleep(5000);

        // Navigate forward

       // driver.navigate().forward();

     //   7.Maximize the window
      //  driver.manage().window().minimize();
        // 8. Refresh the page

     //   driver.navigate().refresh();

       // 9.get current URL

        String Url = driver.getCurrentUrl();
        System.out.println("Current Url:" +Url);


       // 10. Close the browser
                driver.quit();

        // 11. Close the particular tab or window

        driver.close();













      //  driver.get("https://demo.nopcommerce.com/");


      //  driver.findElement(By.id("")).sendkeys

       // driver.findElement(By.id("Password")).sendkeys("0123");

       // driver.findElement(By.className(/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/label

    }
}
