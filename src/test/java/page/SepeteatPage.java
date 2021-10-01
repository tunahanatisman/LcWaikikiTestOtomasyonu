package page;

import base.BasePage;
import org.junit.Assert;

public class SepeteatPage extends BasePage {

    public void productIncrease(){
        clickElementByXpath("//select[@class='amount']/option[@value='2']");
    }
    public void checkProductCount(){
        String productCount = getTextByXpath("//select[@class='amount']/option[@value='2']");
        Assert.assertEquals(productCount,"2");
    }
    public void deleteProduct(){
        clickElementByXpath("(//a[@title='Sil'])[1]");
    }
    public void checkResult() throws InterruptedException {

        Thread.sleep(2000);
        String resultMessage = getTextByXpath("//h2[.='Sepetinizde ürün bulunmamaktadır.']");
        System.out.println(resultMessage);
        Assert.assertEquals(resultMessage,"Sepetinizde ürün bulunmamaktadır.");
    }
}