package com.guru99.demo.steps;

import com.guru99.demo.pageObject.PaginaUsuarioPage;
import com.guru99.demo.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaUsuarioStep  {

    PaginaUsuarioPage paginaUsuarioPage = new PaginaUsuarioPage();
    Excel excel = new Excel();

    //se implementab el metodo de validacion
    // para poder validar se necesita crear un metodo de tipo String el cual almacena el texto del localizador
   /** public String getTextElement(By localizador) {
        return paginaUsuarioPage.getDriver().findElement(localizador).getText();
    }
    public void validacion(By localizador, String texto) {
        assertEquals(getTextElement(localizador), texto);
    }*/
    @Step

   /** public void validarUsuario() throws IOException {
        validacion(paginaUsuarioPage.getDriver().findElement( paginaUsuarioPage.getLblUsuario() ),"Dear luis mirro,"
                //+excel.leerDatosExcel( "Data.xlsx","Datos",1,0 )+" "
               // +excel.leerDatosExcel( "Data.xlsx","Datos",1,1 )+","
                );
            }*/
    public void validarUsuario(){
        // esto es para verificar que el elemento este disponible
        Assert.assertThat(paginaUsuarioPage.getDriver().findElement(paginaUsuarioPage.getLblUsuario()
        ).isDisplayed(), Matchers.is(true));
    }
}
