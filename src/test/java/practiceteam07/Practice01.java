package practiceteam07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01 {

    public static void main(String[] args) {

        //1. Tarayıcıyı başlatın
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. 'https://automationexercise.com/' URL'sine gidin
        driver.get("https://automationexercise.com/");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anasayfa = driver.findElement(By.cssSelector("html[lang='en']"));
        if (anasayfa.isDisplayed()){
            System.out.println("Anasayfa görünüm testi PASSED");
        }else System.out.println("Anasayfa görünüm testi FAİLED");

        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        WebElement kaydolButonu = driver.findElement(By.cssSelector("a[href='/login']"));
        kaydolButonu.click();

        //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        WebElement yeniKulKay =driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        if(yeniKulKay.isDisplayed()){
            System.out.println("Yeni kullanıcı kaydı testi PASSED");
        }else System.out.println("Yeni kullanıcı kaydı testi FAILED");

        //6. Adı ve e-posta adresini girin
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Afra");
driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("afracinar@icloud.com");

        //7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();

        //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
        WebElement hesapBilGir = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        if (hesapBilGir.isDisplayed()){
            System.out.println("Hesap Bilgilerini Gir testi PASSED");
        }else System.out.println("Hesap Bilgilerini Gir testi FAILED");

        //9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. 'Hesap Oluştur düğmesini' tıklayın
        //14. 'HESAP OLUŞTURULDU!' görünür
        //15. 'Devam Et' düğmesini tıklayın
        //16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        //17. 'Hesabı Sil' düğmesini tıklayın
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın

    }
}
