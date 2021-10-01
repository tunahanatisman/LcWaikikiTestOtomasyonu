package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class BasePage extends BaseTest {

    Actions action = new Actions(driver);


    public WebElement findElementByClassName(String className){
        return driver.findElement(By.className(className));
    }
    public WebElement findElementByCssSelector(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }
    public List<WebElement> findElementsByXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }
    public WebElement findElementById(String id){
        return driver.findElement(By.id(id));
    }
    public WebElement findElementByXpath(String xpath){
        return  driver.findElement(By.xpath(xpath));
    }

    public void clickElementById(String id)
    {
        findElementById(id).click();
    }
    public void clickElementByClassName(String ClassName)
    {
        findElementByClassName(ClassName).click();
    }
    public void clickElementByXpath(String xpath)
    {
        findElementByXpath(xpath).click();
    }
    public void clickElementByCssSelector(String cssSelector)
    {
        findElementByCssSelector(cssSelector).click();
    }

    public void sendKeysElementById(String id,String text)
    {
        findElementById(id).sendKeys(text);
    }
    public void sendKeysElementByClassName(String ClassName,String text)
    {
        findElementByClassName(ClassName).sendKeys(text);
    }
    public void sendKeysElementByXpath(String xpath,String text)
    {
        findElementByXpath(xpath).sendKeys(text);
    }

    public void hoverToElementByXpath(String xpath){
        WebElement element = findElementByXpath(xpath);
        action.moveToElement(element).build().perform();
    }
    protected void moveScrollToElement(String  xpath){
        WebElement element = findElementByXpath(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element );
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public void checkedUrl(String url){
        Assert.assertEquals(getCurrentUrl(),url);
    }
    public String getTextById(String id){
        return findElementById(id).getText();
    }
    public String getTextByXpath(String xpath){
        return findElementByXpath(xpath).getText();
    }

}