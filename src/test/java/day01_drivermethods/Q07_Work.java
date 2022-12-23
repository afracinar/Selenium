package day01_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q07_Work {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //sayfanın konumu ve boyutlarını yazdırın
        System.out.println("Konum: "+driver.manage().window().getPosition());
        System.out.println("Boyut: "+driver.manage().window().getSize());

        //sayfanın konum ve boyutlarınnı istediğiniz şekilde ayarlayın
        driver.manage().window().setPosition(new Point(800,700));
        driver.manage().window().setSize(new Dimension(400,300));

        //sayfanın sizin istediğiniz boyut ve konuma gelip gelmediğini test edin

        //sayfayı kapatın
    }
}
