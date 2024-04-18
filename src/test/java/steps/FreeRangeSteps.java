package steps;
 
import java.util.List;
 
import org.testng.Assert;
 
import java.util.Arrays;
 
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import org.testng.asserts.SoftAssert;




 
public class FreeRangeSteps {

    SoftAssert soft = new SoftAssert();
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();
 
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
 
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }


    @And("Select Fundamentos del Testing")
    public void selectFundamentosDelTesting() {
        cursosPage.clickFundamentosTestingLink();
    }

    @And("Select Introducción al Testing")
    public void selectIntroductionToTesting() {
        fundamentosPage.clickIntroductionTestingLink();
    }
 
    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }
 
 
 
    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos",
                "Academia: $176 / año • 11 productos", "Free: Gratis • 1 producto");
 
        Assert.assertEquals(listaEsperada, lista);
    }

    public void Ejemplulis() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        soft.assertAll();
    }
 
}