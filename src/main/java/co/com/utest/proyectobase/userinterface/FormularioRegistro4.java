package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRegistro4 extends PageObject {
    public static final Target CLAVE = Target.the("Escribir la clave").located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE= Target.the("Confirma clave").located(By.id("confirmPassword"));
    public static final Target CHECK1 = Target.the("Seleccionar checkbox 1").
            located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK2 = Target.the("Seleccionar checkbox 2").
            located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK3 = Target.the("Seleccionar checkbox 3").
            located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CLIC_BOTON_COMPLETAR = Target.the("Clic en el botón completar").
            located(By.xpath("//a[@id='laddaBtn']/span"));
}
