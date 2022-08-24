package Pages;

import Excel.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    By products = By.cssSelector("div.product-header a.image");
    By productName=By.cssSelector("div.col-12.col-xl-7  h1");
    By productPrice=By.cssSelector("div.amount strong");

    By addToCartButton=By.cssSelector("button[onclick=\"SepeteEkle('11373')\"]");

    By cartButton=By.cssSelector("a[href=\"/Sepetim\"]");

    public List<WebElement> getProducts(){
        return findAll(products);
    }

    public void clickProduct(){
        getProducts().get(0).click();
    }


    public String productName(){
        String name=findElementWait(productName).getText();
        System.out.println(name);
        return name;
    }

    public String productPrice(){
       String price=findElementWait(productPrice).getText();
        System.out.println(price);
       return price;
    }

    public void addCart(){
        click(addToCartButton);
    }

    public void goToCart(){
        click(cartButton);
    }
}
