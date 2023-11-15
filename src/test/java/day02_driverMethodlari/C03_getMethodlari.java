package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
           Selenium 4.12 versiyonu ile
           kendi Webdriver'ını da oluşturabilirsiniz

           Yani artık dışardan bir webdriver tanımlama MECBURİYETİ  kalmadı

           ANCAK...şirketlerin pek çoğu kendilerine özel olarak
           satın aldıkları webdriver'ları kullanabiliiyor

           Biz bu duruma alışmak için
           Selenium webdriver yerine indirdiğimiz driver.exe dosyasını kullanmaya devam edeceğiz
         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
       // System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle()); // AD147FE75DD71075DC2C8C46D0EA53D8
        // Wndow handle değeri : Selenium'un oluşturduğu her webdriver objesine verdiği
        //                                                   unique bir kod'dur
        //                                                   Biz bu değerleri birden fazla sayfa açılırsa, sayfalar arasında geçiş yapmasını sağlar


        System.out.println(driver.getWindowHandles()); // [2108F402D37A8798C952DD87A71BE139]
        // Aktif webdriver objesinin açtığı tüm SAYFALARININ window handle değerlerini getirir

        driver.quit();
    }
}
