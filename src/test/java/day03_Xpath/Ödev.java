package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ödev {

    /*
-Amazon sayfasına gidiniz
-Arama kutusunu locate ediniz
-Arama kutusunun tagName'inin input olduğunu test ediniz
-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
-Sayfayı kapatınız

AutomationExercise sitesi
*/
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com/%22");

        WebElement aramaKutusu = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        if (aramaKutusu.getTagName().equals("input")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        WebElement olan = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        String beklenen = "field-keyword";
        if(olan.getAttribute("name").equals(beklenen)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }

        driver.close();


    }
}
