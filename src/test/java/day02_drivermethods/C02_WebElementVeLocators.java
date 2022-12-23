package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class C02_WebElementVeLocators {
    /*
    findElement() :
    Driver'ın bir elementi bulması için findElement() methodunu kullanırız
    Bu tek bir webelemnt'ini döndürür.Aynı locator ile ulaşılabilen birden fazla element varsa ilkini döndürür
    Driver elementi bulamazsa run time exception verir: NoSuchElementException

    findElements() :
    Locator değerine uygun Web elementlerinin listesini döndürür
    Locator stratejisiyle eşleşen web elementi yoksa boş bir liste döndürür
    NoSuchElementException hatası vermez
    Listedeki her web elementi 0 'dan başlayan bir index alır
    Mesela kategori vs döndürmek istersek findelemets kullanırız

                                                             findElemet()                      findElements()
       Web sayfasında birdenf azla WebElement locator      ilk elemanı döndürür              Tüm elemanları döndürür
       ile uyuşursa

       Web sayfasındaki hiçbir WebElement locator ile      NoSuchElementException             Exception fırlatmaziboş bir liste döndürür
       uyuşmazsa                                           fırlatı

       Return Type                                         WebElement                         List<WebElement>

       Elemana erişim                                      Direk ulaşılabilir                 List'ten index veya iterator ile ulaşılabilir
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("http://amazon.com");

        //search bölümünü locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //search bölümünde ıphone aratalım
        aramaKutusu.sendKeys("iphone", Keys.ENTER); //ıphone yaz entera bas

        /*
        Eğer bir WebElementi (Web sayfasındaki herbir buton ya da text/yazı) locate (konumunu belirleme) etmek istersek
        önce manuel olarak web sayfasını açıp sayfa üzerinde sap click yapıp "incele" ye tıklarız.Karşımıza çıkan HTML kodlarından
        locater'lardan (konum belirleyiciler) eşsiz olanı seçeriz
        Genellikle id Attribute'u kullanılır.
        Seçtiğimiz attribute değerini findelement() methodu içine findelement(By.id("artibute değeri")) şeklinde yazarız
         */

        /*
        tagName: çoğunlukla öglerin listesini almak için kullanılırçBu nedenle findElements() yöntemiyle kullanılması
        öneerilir..Sayfadaki tüm linkleri döndürmek için By.tagName("a") kullanılabilir
         */

        //Amazon sayfasındaki <input> taglarının sayısını yazdırınız
        List<WebElement> linkler= driver.findElements(By.tagName("input")); //list'e koyacağımız için findElements koyduk
        System.out.println("Input tag sayısı = "+linkler.size()); //Input tag sayısı = 132  (farklı çıkıyabiliyor sonuçlar konuma göre)

        //Amazon sayfasındaki <a> taglarının sayısını ve linklerin ismini yazdırınız

        List <WebElement> linklerlist = driver.findElements(By.tagName("a"));
        System.out.println("a tag sayısı = "+linklerlist.size()); //a tag sayısı = 423  (farklı çıkıyabiliyor sonuçlar konuma göre)

        for (WebElement w : linklerlist) {   //döngü olduğu için for-each kullandık
            System.out.println(w.getText());         //getText() ==> webelement üzerindeki yazıyı getirir
        }


    }
}
