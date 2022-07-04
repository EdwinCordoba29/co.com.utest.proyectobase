package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRegistro2 extends PageObject {
    public static final Target INGRESAR_CIUDAD = Target.the("Donde se ingresa la ciudad de residencia").
            located(By.xpath("//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12']//input[@id='city']"));

    public static final Target INGRESAR_CODIGO_POSTAL = Target.the("Donde se ingresa el código postal de residencia").
            located(By.xpath("//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12']//input[@id='zip']"));

    public static final Target CLIC_PAISES = Target.the("Clic en el campo de paises").
            located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target INGRESAR_PAIS = Target.the("Donde se ingresa el país de residencia").
            located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target CLIC_SIGUIENTE = Target.the("Clic en el botón siguiente").
            located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']//span"));
}
