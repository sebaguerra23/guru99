package com.guru99.demo.stepDefinitions;


import com.guru99.demo.steps.PaginaRegistroStep;
import com.guru99.demo.steps.PaginaUsuarioStep;
import com.guru99.demo.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinition {

    Excel excel = new Excel();
    @Steps
    PaginaRegistroStep paginaRegistroSteps;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;


    @Dado( "^que el usuario encuentra la pagina demo demo guru$" )
    public void queElUsuarioEncuentraLaPaginaDemoDemoGuru( ) throws IOException {
        paginaRegistroSteps.abrirNavegador();
    }

    @Cuando("^el usuario usuario se registra en la pagina demo guru$")
    public void elUsuarioUsuarioSeRegistraEnLaPaginaDemoGuru() throws IOException {

    paginaRegistroSteps.registro();
    }

    @Entonces("^se valida registro exitoso$")
    public void seValidaRegistroExitoso() throws IOException {
        paginaUsuarioStep.validarUsuario();

    }

}
