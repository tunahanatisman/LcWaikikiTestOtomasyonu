package page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {

    public void searchProduct(String searchKey){
        sendKeysElementByXpath("<input type=\"text\" class=\"search search-activated\" id=\"search\" name=\"search\" placeholder=\"Ürün, kategori veya marka ara\" autocomplete=\"off\" data-tracking-category=\"Giris\" data-tracking-action=\"Typing\" data-tracking-label=\"Ürün Arama\" data-url=\"\" data-text=\"Marie Claire Fırsatları\" value=\"Marie Claire Fırsatları\">",searchKey);
        clickElementByXpath("<a class=\"search-button active\">\n" + "<span>ARA</span>\n" + "</a>");
    }

    public void goToSecondPage() {
        moveScrollToElement("<p class=\"lazy-load-text\">Daha Fazla Ürün Gör</p>");
        clickElementByXpath("<p class=\"lazy-load-text\">Daha Fazla Ürün Gör</p>");
    }
    public void controlSecondPageUrl(){
        checkedUrl("https://www.lcwaikiki.com/tr-TR/TR/arama?q=Pantolon");
    }

    public void selectRandomProduct(String xpath) {

        Random random=new Random();
        List<WebElement>products=findElementsByXpath(xpath);
        System.out.println("Sayfa üzerinde bulunan ürün sayısı = " + products.size());
        int randomNumber =random.nextInt(products.size());
        WebElement element = products.get(randomNumber);
        System.out.println("Rastgele seçilen ürün ındex =" + randomNumber);
        element.click();
    }
}