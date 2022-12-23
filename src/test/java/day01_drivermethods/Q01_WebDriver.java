package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_WebDriver {

    public static void main(String[] args) {

     //   System.setProperty("webDriver.chrome.driver", "adres");
        /*
        En temel haliyle otomasyon yapmak için Class'ımıza otomasyon için gerekli olan webdriver'ın yerini göstermemiz
        gerkiyor.Bunun için Java kütüphanesinden System.setProperty() mehodunun içine ilk olarak için gerekli olan webdriver'ı yazarız
        İkinci olarak driverin fiziki yolunu kopyalarız.
        (güncellemeyle benim yüklediğim versiyonda bunu yazmama gerek kalmıyor sadece bilgi diye yazdım)
         */

        //browser'a bağlandık
        WebDriver driver = new ChromeDriver();

        //adrese gittik
        driver.get("https://www.amazon.com/");
    }
}
