package com.guru99.demo.pageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
@DefaultUrl( "https://demo.guru99.com/test/newtours/" )
public class PaginaRegistroPage extends PageObject {

    By btnRegistrar = By.xpath("(//a[@href='register.php'])[1]");
    By txtNombre = By.xpath("//input[@name='firstName']");
    By txtApellido = By.xpath("//input[@name='lastName']");
    By txtCelular = By.xpath("//input[@name='phone']");
    By txtCorreo = By.xpath("//input[@name='userName']");
    By txtDireccion = By.xpath("//input[@name='address1']");
    By txtCiudad = By.xpath("//input[@name='city']");
    By txtDepartamento = By.xpath("//input[@name='state']");
    By txtCodigoPostal = By.xpath("//input[@name='postalCode']");
    By lstPais = By.xpath("//select[@name='country']");
    By txtUsuario = By.xpath("//input[@name='email']");
    By txtPassword = By.xpath("//input[@name='password']");
    By txtConfirmarPassword = By.xpath("//input[@name='confirmPassword']");
    By btnEnviar = By.xpath("//input[@name='submit']");
    By btnPais = By.xpath("//select");
    public By getBtnRegistrar( ) {
        return btnRegistrar;
    }
    public By getTxtNombre( ) {
        return txtNombre;
    }
    public By getTxtApellido( ) {
        return txtApellido;
    }
    public By getTxtCelular( ) {
        return txtCelular;
    }

    public By getTxtCorreo( ) {
        return txtCorreo;
    }

    public By getTxtDireccion( ) {
        return txtDireccion;
    }

    public By getTxtCiudad( ) {
        return txtCiudad;
    }

    public By getTxtDepartamento( ) {
        return txtDepartamento;
    }

    public By getTxtCodigoPostal( ) {
        return txtCodigoPostal;
    }

    public By getLstPais( ) {
        return lstPais;
    }

    public By getTxtUsuario( ) {
        return txtUsuario;
    }

    public By getTxtPassword( ) {
        return txtPassword;
    }

    public By getTxtConfirmarPassword( ) {
        return txtConfirmarPassword;
    }

    public By getBtnEnviar( ) {
        return btnEnviar;
    }

    public By getBtnPais( ) {
        return btnPais;
    }
}
