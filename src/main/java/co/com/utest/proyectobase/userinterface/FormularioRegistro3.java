package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRegistro3 extends PageObject {

    public static final Target CLIC_SELECCIONAR_PC = Target.the("Clic Seleccionar sistema operativo de PC").
            located(By.xpath("//div[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target SELECCIONAR_PC = Target.the("Selecciona sistema operativo de PC").
            located(By.xpath("//div[@id='web-device']/div[1]/div[2]/div/input[1]"));

    public static final Target CLIC_SELECCIONAR_VERSION_PC = Target.the("Clic seleccionar versión PC").
            located(By.xpath("//div[@id='web-device']/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECCIONAR_VERSION_PC = Target.the("Seleccionar versión PC").
            located(By.xpath("//div[@id='web-device']/div[2]/div[2]/div/input[1]"));

    public static final Target CLIC_SELECCIONAR_LENGUAJE_PC = Target.the("Clic seleccionar lenguaje PC").
            located(By.xpath("//div[@id='web-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target SELECCIONAR_LENGUAJE_PC = Target.the("Seleccionar versión PC").
            located(By.xpath("//div[@id='web-device']/div[3]/div[2]/div/input[1]"));

    public static final Target CLIC_MOVIL = Target.the("Clic seleccionar movil").
            located(By.xpath("//div[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));

    public static final Target SELECCIONAR_MOVIL = Target.the("Seleccionar movil").
            located(By.xpath("//div[@id='mobile-device']/div[1]/div[2]/div/input[1]"));

    public static final Target CLIC_MODELO_MOVIL = Target.the("Clic modelo movil").
            located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[1]"));

    public static final Target SELECCIONAR_MODELO_MOVIL = Target.the("Seleccionar modelo movil").
            located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/input[1]"));

    public static final Target CLIC_SISTEMA_MOVIL = Target.the("Clic sistema movil").
            located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target SELECCIONAR_SISTEMA_MOVIL = Target.the("Seleccionar sistema movil").
            located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target CLIC_SIGUIENTE = Target.the("Clic siguiente").
            located(By.xpath("//section[@id=\"regs_container\"]//span[contains(text(),'Next: Last Step')]"));




}
