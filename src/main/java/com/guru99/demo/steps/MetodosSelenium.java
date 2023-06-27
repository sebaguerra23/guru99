package com.guru99.demo.steps;

import static junit.framework.TestCase.assertEquals;

public class MetodosSelenium {
//Metodos reutilizables o dinamicos
/**    public void escribir(By localizador, String texto) {
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto);
    }
    public void limpiarCampo(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }
    public void clickear(By localizador) {

        SeleniumWebDriver.driver.findElement(localizador).click();
    }
    public void selecionar(By localizador, String texto) {
        Select selector = new Select(SeleniumWebDriver.driver.findElement(localizador));
        selector.selectByValue(texto);
    }
    //se implementab el metodo de validacion
    // para poder validar se necesita crear un metodo de tipo String el cual almacena el texto del localizador
    public String getTextElement(By localizador) {
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }
    public void validacion(By localizador, String texto) {
        assertEquals(getTextElement(localizador), texto);
    }*/


}
