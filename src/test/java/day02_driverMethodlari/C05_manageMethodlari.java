package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        /*
          Wait konusunu ilerde daha detaylı anlatacağız
          implicitlyWait() sayfanın yüklenmesi ve/veya
          arayacağımız web elementleri bulmak için dinamik olarak tanımlanmış
          maximum bekleme süresidir.

          Asıl amaç bekleme değil görevi yapmaktır

          burada tanımlanan süre
           görevi yapmaya çabalayacağı max süredir
          bu süre içerisinde görevi yapamazsa
          exception fırlatır
         */

        System.out.println("ilk baştaki konum : " + driver.manage().window().getPosition());
        System.out.println("ilk baştaki size : " + driver.manage().window().getSize());

        driver.manage().window().maximize();
        System.out.println("ilk maximize konum : " + driver.manage().window().getPosition());
        System.out.println("ilk maximize size : " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen size : " + driver.manage().window().getSize());

        // pencereyi başlangıç noktası (50,100) ve size'i (1000,700) yapın

        driver.manage().window().setSize(new Dimension(1000,700));
        driver.manage().window().setPosition(new Point(50,100));

        System.out.println("özel konum : " + driver.manage().window().getPosition());
        System.out.println("özel size : " + driver.manage().window().getSize());

        System.out.println(driver.manage().window().getSize().getWidth());

        driver.quit();

    }
}