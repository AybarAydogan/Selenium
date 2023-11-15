package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_İlkTest {
    public static void main(String[] args) throws InterruptedException {

        // testotomasyonu anasayfaya gidin
        // URL'in https://www.testotomasyonu.com/ oldugunu
        // ve Title'in test kelimesi icerdigini test edin


        // Her test için mutlaka bir webdriver oluşturmalı
        // ve gerekli ayarlamaları yapmalıyız
        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin

        driver.get("http://www.testotomasyonu.com");

        // URL'in https://www.testotomasyonu.com oldugunu

        String expectedUrl = "https://www.testotomasyonu.com/";
        String actuaUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actuaUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAİLED");
            System.out.println("Actual URL : " + actuaUrl);
        }

        // ve Title'in test kelimesi icerdigini test edin

        String expectedTitleIcerigi = "test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerigi)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAİLED");
            System.out.println("actualTitle " + actualTitle);
        }

        driver.quit();




    }
}
