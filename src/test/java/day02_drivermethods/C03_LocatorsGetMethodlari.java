package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {

    /*
    webElement.getText() ==> Web element üzerindeki yazıyı getirir
    webElement.getAttribute("attribute ismi")) ==> İsmi girilen attribute'in değerini getirir
    webElement.getTagname() ==> Webelementinin tag ismini getirir

     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //Amazon sayfasına gidelim
        driver.get("http://amazon.com");

        //Search bölümünü locate edip ıphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Arama sonuç yazısında iphone yazısını locate edip konsola yazdıralım
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        //sayfayı kapatın
        driver.close();

    }
}
