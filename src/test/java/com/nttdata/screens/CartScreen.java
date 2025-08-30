package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement cartCount;

    public void clickAddToCartButton() {
        waitFor(ExpectedConditions.visibilityOf(btnAddToCart)).click();
    }

    public int getCartItemCount() {
        waitFor(ExpectedConditions.visibilityOf(cartCount));
        String cartCountText = cartCount.getText().trim();
        return cartCountText.isEmpty() ? 0 : Integer.parseInt(cartCountText);
    }
}
