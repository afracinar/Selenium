package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05_Work {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Youtube ana sayfasına gidelim
        driver.get("https://www.youtube.com");

        //amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");

        //tekrar youtube sayfasına dönelim
        driver.navigate().back();

        //yeniden amazon sayfasına gidelim
        driver.navigate().forward();

        //sayfayı refresh yapalım
        driver.navigate().refresh();

        //sayfayı kapatalım
        driver.close();

    }
}
