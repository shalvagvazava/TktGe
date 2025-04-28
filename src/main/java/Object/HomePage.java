package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebElement categories;
    private WebDriver driver;
    public WebElement railway;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.categories = driver.findElement(By.id("categories-desktop-trigger"));
        this.railway = driver.findElement(By.xpath("//*[@href='/railway']"));
    }
}
