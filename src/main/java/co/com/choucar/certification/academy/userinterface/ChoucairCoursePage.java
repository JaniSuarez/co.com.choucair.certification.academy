package co.com.choucar.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairCoursePage extends PageObject {
    public static final Target BUTTON_UN = Target.the("Selecione la Universidad")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final  Target INPUT_COURSE = Target.the("Selecione el curso")
            .located(By.id("coursesearchbox"));
    public static final  Target BUTTON_GO = Target.the("Click para continuar")
            .located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Selecione el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}
