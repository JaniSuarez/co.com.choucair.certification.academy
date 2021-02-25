package co.com.choucar.certification.academy.questions;

import co.com.choucar.certification.academy.userinterface.ChoucairCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private final String question;

    public Answer(String question) {
        this.question = question;

    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(ChoucairCoursePage.NAME_COURSE).viewedBy(actor).asString();
            if (question.equals(nameCourse)){
                result=true;
            }else{
                result= false;
            }
        return result;
    }
}
