package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C02_CssSelector {

    /*
        cssSelactor'un 3 çeşit kullanımı vardır:
        1) tag[attribute='value']
        2) tag#value
        3) .value
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //2-https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3-Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.contains("Spend less")){
            System.out.println("Başlık testi passed");
        }else System.out.println("Başlık testi failed");

        //6-Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //7-Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();

        //8-Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSeller = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSeller.get(0).click();

        // 9-Gift card details’den 25 $’i secin
         driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunFiyat = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (urunFiyat.getText().equals("$25.00")){
            System.out.println("Fiyat testi passed");
        }else{
            System.out.println("Fiyat testi failed");
        }

        //10-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
