package Pages;

import Excel.ReadExcelFile;
import org.openqa.selenium.By;

import java.io.IOException;

public class HomePage extends BasePage{
    By btnLoginButton=By.cssSelector("a.btn.login");
    By searchBar = By.id("searchBar");
    By searchButton=By.cssSelector("button[onclick=\"AramaYap()\"]");

    public void goToLoginPage(){
    click(btnLoginButton);
    }

    public void searchProduct() throws IOException {
        sendKeys(searchBar, ReadExcelFile.read(1,2));
        click(searchButton);
    }
}
