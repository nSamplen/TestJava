import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEbay {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
        // имитируем нажатие Enter
        driver.findElement(By.id("gh-ac")).sendKeys(Keys.RETURN);

        /*
        // или нажатие кнопки "Найти"
        driver.findElement(By.id("gh-btn")).click();
        */

        // или xpath
        driver.findElement(By.xpath("//h3[@class='s-item__title']")).click();


    }

}
