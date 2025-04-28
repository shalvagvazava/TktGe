package common;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver driver;
    JavascriptExecutor js;
    public BaseClass (){
        driver = new ChromeDriver();
        js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    public void openTktWeb(){
        driver.get("https://tkt.ge/");
    }
}

