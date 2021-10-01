package tests;

import base.BaseTest;
import org.junit.Test;
import page.SepeteatPage;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;



public class TestCaseLcwaikiki extends BaseTest {

    @Test
    public void startTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage() ;
        ProductPage productPage = new ProductPage() ;
        SepeteatPage sepeteatPage = new SepeteatPage() ;
        loginPage.goLogin();
        loginPage.beLogin("tunahanatisman7@gmail.com","Tuna.1234");
        loginPage.controlLogin("//span[contains(text(),'tuna194587')]");
        homePage.searchProduct("pantolon");
        homePage.goToSecondPage();
        homePage.controlSecondPageUrl();
        homePage.selectRandomProduct("//a[contains(@class,'product-link')]");
        productPage.comparePrice();
        sepeteatPage.productIncrease();
        sepeteatPage.checkProductCount();
        sepeteatPage.deleteProduct();
        sepeteatPage.checkResult();
    }
}
