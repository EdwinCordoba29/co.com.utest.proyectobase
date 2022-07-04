package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class FormularioRegistro1 extends PageObject {
    public static final Target BOTON_UNETE_HOY = Target.the("Botón que muestra el formulario de registro paso 1").
            located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//ul[@class='nav navbar-nav']//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target INGRESAR_NOMBRE = Target.the("Donde se escribe el nombre").
            located(By.id("firstName"));

    public static final Target INGRESAR_APELLIDO = Target.the("Donde se escribe el apellido").
            located(By.id("lastName"));

    public static final Target INGRESAR_EMAIL = Target.the("Donde se escribe el E-mail").
            located(By.id("email"));

    public static final Target SELECCIONAR_MES = Target.the("Donde se selecciona el mes de nacimiento").
            located(By.xpath("//select[@ng-model='registrationData.birthDate.month']"));

    public static final Target SELECCIONAR_DIA = Target.the("Donde se selecciona el día").
            located(By.xpath("//select[@ng-model='registrationData.birthDate.day']"));

    public static final Target SELECCIONAR_ANIO = Target.the("Donde se selecciona el año").
            located(By.xpath("//select[@ng-model='registrationData.birthDate.year']"));

    public static final Target INGRESAR_LENGUAJES = Target.the("Donde se ingresan los lenguajes").
            located(By.xpath("//div[@id='languages']/div[1]/input"));

    public static final Target CLIC_SIGUIENTE = Target.the("Clic en el botón siguiente").
            located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));
}
