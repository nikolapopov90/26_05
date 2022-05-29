import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\3200g\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kupujemprodajem.com/index.php");
        String title = driver.getTitle();
        String expected = "Kupujem prodajem";

        WebElement el = driver.findElement(By.xpath("//*[@id=\"searchKeywordsInput\"]"));
        el.sendKeys("iphone 13");
        el.submit();
        WebElement el2 = driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/div/section[2]/div[1]/div[1]/a"));
        el2.click();

    }

}
