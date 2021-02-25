package co.com.choucar.certification.academy.tasks;

import co.com.choucar.certification.academy.userinterface.ChoucairCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {


    private final String course;

    public Search(String course) {
    this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairCoursePage.BUTTON_UN),
                Enter.theValue(course).into(ChoucairCoursePage.INPUT_COURSE),
                Click.on(ChoucairCoursePage.BUTTON_GO),
                Click.on(ChoucairCoursePage.SELECT_COURSE));
    }
}
