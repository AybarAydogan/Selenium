package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        // Bu satır oluşturucağımız webdriver'ın özelliklerin set ediyor
        // webdriver otomasyon sırasında bizim elimiz, gözümüzi herşeyimizdir

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com/");


        driver.manage().window().maximize();


        driver.close();


    }
}
