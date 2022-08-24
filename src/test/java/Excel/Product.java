package Excel;

public class Product {
    String email;
    String password;
    String productName_ProductPage;
    String productPrice_ProductPage;

    String searchName;

    public Product(String email,String password,String searchName){
        this.email=email;
        this.password=password;
        this.searchName=searchName;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setProductPrice_ProductPage(String  productPrice_ProductPage){
        this.productPrice_ProductPage=productPrice_ProductPage;
    }

    public void setProductName_ProductPage(String productName_ProductPage){
        this.productName_ProductPage=productName_ProductPage;
    }

    public String getProductName_ProductPage(){
        return productName_ProductPage;
    }

    public String getProductPrice_ProductPage(){
        return productPrice_ProductPage;
    }


    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getProductName(){
        return productName_ProductPage;
    }
    public String getPrice(){
        return productPrice_ProductPage;
    }

    public String getSearchName(){
        return searchName;
    }

}
