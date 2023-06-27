package com.guru99.demo.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPage extends PageObject {

    By lblUsuario = By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[2]");

    public By getLblUsuario( ) {
        return lblUsuario;
    }
}
