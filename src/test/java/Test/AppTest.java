package Test;
import Excel.Product;
import Excel.ReadExcelFile;
import Excel.WriteExcelFile;
import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;



public class AppTest extends BaseTest {
    @Test
    public void FirstScenario() throws IOException {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        homePage.goToLoginPage();
        loginPage.login();
        homePage.searchProduct();
        productPage.clickProduct();
        WriteExcelFile.writeExcel(3,productPage.productName(),4, productPage.productPrice());
        productPage.addCart();
        productPage.goToCart();


        Assert.assertEquals("Error on name",ReadExcelFile.read(1,3),cartPage.getProductName_Cart());
        Assert.assertEquals("Error on Price",ReadExcelFile.read(1,4),cartPage.getProductPrice_Cart());




    }
}
