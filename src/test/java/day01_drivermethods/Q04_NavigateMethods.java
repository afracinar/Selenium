package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q04_NavigateMethods {

    /*
    driver.navigate().to(String url) ==> String olarak girilen url'ye gider
        driver.get() ile aynı işe yarar
    driver.navigate().back() ==> methodu içinde olunan sayfadan ,geldiği önceki sayfaya döndürür
    driver.navigate().forward() ==> back ile dönülen bir sayfadan tekrar ileri gider
    driver.navigate().refresh() ==> methodu içinde olunan sayfayı yeniler

     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına git
        driver.navigate().to("https://www.amazon.com");

        //Techproeducation sayfasına git
        Thread.sleep(3000);
        driver.navigate().to("https://www.techproeducation.com");

        //Tekrar amazon sayfasına dön
        Thread.sleep(3000);
        driver.navigate().back();

        //tekrar techproeducation sayfasına git
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayı yenile(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayı kapat
        driver.close();
    }
}
