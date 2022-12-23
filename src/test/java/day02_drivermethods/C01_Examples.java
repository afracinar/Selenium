package day02_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    public static void main(String[] args) {

        /*
        İlk önce browser'ı maximize yapalım sonra tüm sayfa için maximum bekleme süresi olarak 15 sn belirtelim
        Sırasıyla amazon,facebook ve youtube sayfalarına gidelim
        Amazon sayfasına tekrar dönelim
        Amazon sayfasının url'inin https://www.amazon.com adresine eşit olduğunu test edelim
        Sayfanın konumunu ve boyutlarını yazdıralım
        Sayfanın konumum ve boyutunun istediğimiz şekilde ayarlayalım ve istediğimiz şekilde olduğunu test edelim
        Sayfayı kapatalım
         */

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

        driver.navigate().back();
        driver.navigate().back();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url test passed");
        }else{
            System.out.println("Url test failed");
        }

        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu :"+driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın yeni konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın yeni boyutu :"+driver.manage().window().getSize());

        Dimension actualYeniSize =driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Yeni size testi passed");
        }else {
            System.out.println("Yeni size testi failed");
        }

        Point actualYeniKonum = driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Yeni konum testi passed");
        }else {
            System.out.println("Yeni konum testi failed");
        }
    }
}
