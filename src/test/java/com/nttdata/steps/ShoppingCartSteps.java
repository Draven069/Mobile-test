package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class ShoppingCartSteps {

    ProductsScreen productsScreen;
    CartScreen cartScreen;

    public void validateGalleryLoaded() {
        Assert.assertTrue("Visibilidad de la galería de productos correctamente.", productsScreen.isProductDisplayed());
    }

    public void selectProductByImage(String productName) {
        productsScreen.clickOnProductImage(productName);
    }

    public void addToCart(int units) {
        for (int i = 0; i < units; i++) {
            cartScreen.clickAddToCartButton();
        }
    }

    public void validateCartQuantity(int expectedQuantity) {
        int actualQuantity = cartScreen.getCartItemCount();
        Assert.assertEquals("El carrito no muestra la cantidad correcta.", expectedQuantity, actualQuantity);
    }
}
