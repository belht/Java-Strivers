import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class DragandDrop {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "D:\\IDE_tools\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://crossbrowsertesting.github.io/");
            driver.findElement(By.cssSelector("[href='drag-and-drop.html']")).click();
            WebElement elem = driver.findElement(By.id("draggable"));
            WebElement elem2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            actions.dragAndDrop(elem, elem2).build().perform();
            Thread.sleep(1500);
            driver.navigate().refresh();
            Thread.sleep(1500);

            elem = driver.findElement(By.id("draggable"));
            elem2 = driver.findElement(By.id("droppable"));
            actions.clickAndHold(elem).moveToElement(elem2).release().build().perform();
        }
}
