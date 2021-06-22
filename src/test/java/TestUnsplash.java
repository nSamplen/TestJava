import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUnsplash {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://unsplash.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("searchKeyword")).sendKeys("cats and dogs");
        driver.findElement(By.name("searchKeyword")).sendKeys(Keys.RETURN);

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_email")).sendKeys("blalblauser@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("qwerty123");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.className("btn-facebook")).click();


        driver.quit();
    }
}
