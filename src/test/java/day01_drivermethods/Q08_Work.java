package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q08_Work {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //bu method her bir webelement için maximum bekleme süresini belirler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("Title testi passed");
        }else{
            System.out.println("Title testi failed.Doğru Başlık: "+actualTitle);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl =driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("Url testi passed");
        }else{
            System.out.println("Url testi failed.Doğru url: "+actualUrl);
        }

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualBaslik= driver.getTitle();
        if (actualBaslik.contains("Walmart.com")){
            System.out.println("Başlık testi passed");
        }else{
            System.out.println("Başlık testi failed");
        }

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //Browser’i kapatin
        driver.close();
    }
}
