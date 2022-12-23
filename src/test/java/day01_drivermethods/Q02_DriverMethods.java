package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_DriverMethods {
    public static void main(String[] args) {

        //boş bir browser açtık
        WebDriver driver = new ChromeDriver();

        //driver.get() string olarak girilen url'ye gider
        driver.get("https://amazon.com");

        //get.Title() içinde olunan sayfanın başlığını string olarak getirir
        System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more

        //getCurrentUrl() içinde olan sayfanın url'ini veriyor
        System.out.println(driver.getCurrentUrl()); //https://www.amazon.com/

        //getPageSource() içinde olunan sayfanın kaynak kodlarını string olarak getirir
       // driver.getPageSource();

        //içinde olunan sayfa ve/veya tab'ların handle değerlerini getirir.
        // Bize o window'a ait hash değerini verir.Biz bu hash değerlerini bir string'e atayıp pencereler arası geçiş yapabiliriz.
        // Her seferinde ve herkeste farklı verir.
        //açılan yeni pencereye geçmemizi sağlar
        System.out.println(driver.getWindowHandle());


    }
}
