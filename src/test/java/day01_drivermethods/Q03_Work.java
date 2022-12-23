package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q03_Work {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //        Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //        Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //        Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi passed");
        }else{
            System.out.println("Title testi failed");
        }
        //        Sayfa adresini(url) yazdirin
        System.out.println("Url: "+driver.getCurrentUrl());

        //        Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("Url Test Passed");
        }else{
            System.out.println("Url Test failed");
        }

        //        Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());  //sayfalar arası geçiş

        //        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi Passed ");
        }else{
            System.out.println("Source Code Testi Failed ");
        }

        //        Sayfayi kapatin.
        driver.close(); //çoklu pencereler için quit denir,tek sayfa için close
    }
}
