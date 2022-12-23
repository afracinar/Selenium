package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q06_ManageMethods {

    /*
    driver.manage().window().maximize(); ==> Browser'ı maximize yapar
    driver.manage().window().minimize() ==> Browser'ı minimize yapar
    driver.manage().window().fullscreen ==>Browser'ı fullscreen yapar
    driver.manage().window().getSize() ==> Browser'ın ölçülerini,boyutlarını veriyor
    driver.manage().window().getPosition() ==> Browser'ın kordinatlarını veriyor

    driver.manage().window().setPosition(new Point(x,y)); ==> Browser'ı istenen kordinatlara taşır
    driver.manage().window().setSize(new Dimension(x,y)); ==> Browser'ı istenen ölçülere getirir
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); ==>İstenen sayfa açılıncaya kadar maximum bekleme süresini belirtir


     */
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları :"+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları :"+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları :"+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
