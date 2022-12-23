package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C05_Work {

    /*interwievv
    Not:id varsa ilk adi locate edilir id yoksa xpath
     */
    public static void main(String[] args) {

        //SORU:
        //a.web sayfasına gidin. https://www.amazon.com/
        //Search(ara) “city bike”
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuç Yazısı :"+aramaSonucYazisi.get(0).getText());//0.indexteki yazıyı getir

        //Arama sonuç sayısını konsola yazdırınız
        String [] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Arama sonuç sayısı :"+sonucSayisi[2]);

        //Sonuç sayısını lambda ile yazdırınız
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE =driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();





    }
}
