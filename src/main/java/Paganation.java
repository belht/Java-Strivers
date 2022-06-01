import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Paganation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IDE_tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://pagination.js.org/");

        //todo: останавливается на 5 странице
        //todo: добавить асерты с проверкой изменения номера в теге а
        //todo: добавить проверку в DragAndDrop и перенести файлы в тесты
        //todo: сделать тесты на листание страниц на все остальные блоки страниц на странице сайта
        int li = 3;
        while(li !=20) {
            if (li < 7){
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@id='demo1']/div[2]/div/ul/li[" + li + "]/a")).click();
            } else if (li < 18) {
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@id='demo1']/div[2]/div/ul/li[6]/a")).click();
            } else {
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@id='demo1']/div[2]/div/ul/li[" + li + "]/a")).click();
            }
            li++;
        }


    }
}
