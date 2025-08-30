package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ShoppingCartSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ShoppingCartStepsDefs {

    @Steps
    ShoppingCartSteps shoppingCartSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicacion_de_sauce_labs() {

    }

    @Given("valido que carguen correctamente los productos en la galería")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        shoppingCartSteps.validateGalleryLoaded();
    }

    @When("selecciono el producto {string} y agrego {int} al carrito")
    public void selecciono_el_producto_y_agrego_al_carrito(String producto, int unidades) {
        shoppingCartSteps.selectProductByImage(producto);
        shoppingCartSteps.addToCart(unidades);
    }

    @Then("valido que el carrito de compras muestre correctamente {int} unidades")
    public void valido_que_el_carrito_muestre_correctamente_unidades(int unidades) {
        shoppingCartSteps.validateCartQuantity(unidades);
    }
}
