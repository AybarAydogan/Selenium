package utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {

    public static List<String> stringListDonustur(List<WebElement> elementlerListesi){

        List<String> stringListesi = new ArrayList<>();

        for (WebElement each : elementlerListesi
             ) {

            stringListesi.add(each.getText());
        }

        return stringListesi;
    }
}
