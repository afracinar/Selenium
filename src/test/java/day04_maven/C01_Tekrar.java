package day04_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Ödev
        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagname = aramaKutusu.getTagName();
        if(actualTagname.equals("input")){
            System.out.println("TagName testi PASSED");
        }else {
            System.out.println("TagName testi FAILED");
        }

        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        if(aramaKutusu.getAttribute("name").equals("field-keywords")){
            System.out.println("Name atribute testi PASSED");
        }else System.out.println("Name atribute testi FAILED");

        //-Sayfayı kapatınız
        driver.close();
    }

    public static class C02_RelativeLocators {
    }
}
