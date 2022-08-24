package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    By productNameCart= By.cssSelector("div.product-info div u a[href*='rival']");
    By productPriceCart=By.cssSelector("span.price strong");


    public String getProductName_Cart(){
    String name=findElementWait(productNameCart).getText();
    return  name;
    }

    public String getProductPrice_Cart(){
    String price=findElementWait(productPriceCart).getText();
    return price;
    }
}
