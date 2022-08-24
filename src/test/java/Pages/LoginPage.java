package Pages;

import Excel.ReadExcelFile;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends BasePage{
    By email=By.id("EPosta");
    By password=By.id("Sifre");
    By loginButton=By.cssSelector("button[class*=\"btn-itopya\"]");

    public void login() throws IOException {
        sendKeys(email, ReadExcelFile.read(1,0));
        sendKeys(password,ReadExcelFile.read(1,1  ));
        click(loginButton);
    }


}
