package com.nttdata.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement titleProducts;

    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(titleProducts));
        return titleProducts.isEnabled();
    }


    public void clickOnProductImage(String productName) {
        WebElement productImage = getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc='" + productName + "']"));
        waitFor(ExpectedConditions.visibilityOf(productImage)).click();
    }

}
