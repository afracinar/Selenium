package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    /*
    xPath bir elementi locate etmek için kullanılan en etkili methoddur
    diğer 6 method HTML e bağlıdır.yani ordaki atribut'e bağlıdır(id,class,tagname,classname..)
    xPath dinamiktir.Her türlü webEelement için mutlaka xPath yazılabiilir
    2 tür xPath vardır:
     --Absolute xPath
        xPath yazmak için en başa "//" konur.sonraki her tag için "/" konur.Hedef web elemente kadar tüm taglar yazılır
     --RelativexPath
        Bir webElementte temel olarak 3 bileşen vardır:
        tag
        attribute
        attribute value
        Bu üç bileşen kullanılarak her bir webelement için unique sonuç veren birçok xPath yazılabilir
        Yazımı: //tagname[@attribute='value']
  ***** yazımı2: //*[@attribute='value']  --tag farketmeksizin
                 //tagName  //mesela //h3
                 //tagName[@*='value']  --attribute farketmeksizin

            NOTE: Bazen bir attribute'e bağlı olmadan sadece webelement içinde bulunan text kullanılabilir
                 //*[text()='......']
     */



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        Thread.sleep(3000);
        WebElement addButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        //WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //Xpath kullanımında locate edeceğimiz webelement tesxt'e sahipse yukarıdaki şekilde kullanabiliriiz
        addButonu.click();

        //3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete görünür test passed");
        }else{
            System.out.println("Delete görünür değil test failed");
        }

        //4 Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveElementYazisi.isDisplayed()){
            System.out.println("Test Passed");
        }else System.out.println("Test failed");





    }
}
