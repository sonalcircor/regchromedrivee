package homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class util {
    public static void selectDropDown(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);



    }



}
