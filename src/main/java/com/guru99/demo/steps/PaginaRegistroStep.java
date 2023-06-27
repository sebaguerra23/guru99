package com.guru99.demo.steps;
import com.guru99.demo.pageObject.PaginaRegistroPage;
import com.guru99.demo.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class PaginaRegistroStep {

    PaginaRegistroPage paginaRegistroPage = new PaginaRegistroPage();


    Excel excel = new Excel();
    @Step
    public void clickear(By localizador) {

       paginaRegistroPage.getDriver().findElement(localizador).click();
    }
    @Step
    public void escribir(By localizador, String texto) {
        paginaRegistroPage.getDriver().findElement(localizador).sendKeys(texto);
    }
    @Step
    public void selecionar(By localizador, String texto) {
        Select selector = new Select(paginaRegistroPage.getDriver().findElement(localizador));
        selector.selectByValue(texto);
    }
    @Step
    public void abrirNavegador(){
        paginaRegistroPage.open();
    }
    @Step
    public void registro( ) throws IOException {
        clickear( paginaRegistroPage.getBtnRegistrar() );
        escribir( paginaRegistroPage.getTxtNombre(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 0 ) );
        escribir( paginaRegistroPage.getTxtApellido(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 1 ) );
        escribir( paginaRegistroPage.getTxtCelular(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 2 ) );
        escribir( paginaRegistroPage.getTxtCorreo(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 3 ) );
        escribir( paginaRegistroPage.getTxtDireccion(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 4 ) );
        escribir( paginaRegistroPage.getTxtCiudad(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 5 ) );
        escribir( paginaRegistroPage.getTxtDepartamento(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 6 ) );
        escribir( paginaRegistroPage.getTxtCodigoPostal(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 7 ) );
        selecionar( paginaRegistroPage.getLstPais(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 8 ) );
        escribir( paginaRegistroPage.getTxtUsuario(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 9 ) );
        escribir( paginaRegistroPage.getTxtPassword(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 10 ) );
        escribir( paginaRegistroPage.getTxtConfirmarPassword(), excel.leerDatosExcel( "Data.xlsx", "Datos", 1, 10 ) );
        clickear( paginaRegistroPage.getBtnEnviar() );


    }
}