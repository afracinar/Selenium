package day04_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

/*
relative locators kullanırken öenmli olan ortak tagname bulmaktır
 */
public class C02_RelativeLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html    adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //Sayfadaki Berlin WE'ini relative locator ile tıklayalım
        WebElement NYCWebElement = driver.findElement(By.xpath("//*[@id='pid3_thumb']"));

        WebElement bayAreaWebElement = driver.findElement(By.cssSelector("img[id='pid8_thumb']"));

        WebElement BerlinWE = driver.findElement(with(By.tagName("li")).below(NYCWebElement).toLeftOf(bayAreaWebElement));
        BerlinWE.click();
    }
}
