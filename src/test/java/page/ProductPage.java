package page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public void comparePrice() {

        String productPrice = getTextById("sp-price-lowPrice");
        System.out.println("Ürün sayfasındaki fiyat =  " +productPrice);
        addSepeteat();
        hoverToElementByXpath("(//a[contains(@href,'https://www.lcwaikiki.com/tr-TR/TR/sepetim')])[1]");
        clickElementByXpath("(//a[contains(@href,'https://www.lcwaikiki.com/tr-TR/TR/sepetim')])[1]");
        String basketPrice = getTextByXpath("//div[@class='total-price']/strong");
        System.out.println("Ürünün sepetteki fiyatı =  " +basketPrice);
        Assert.assertEquals(productPrice,basketPrice);
    }
    public void addSepeteat(){

        moveScrollToElement("//button[@id='add-to-basket']");
        clickElementByXpath("//button[@id='add-to-basket']");
    }
}