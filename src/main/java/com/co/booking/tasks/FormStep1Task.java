package com.co.booking.tasks;

import com.co.booking.models.Credentials;
import com.co.booking.userinterfaces.FormStep1;
import com.co.booking.userinterfaces.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FormStep1Task implements Task {

    Credentials credentials;

    public FormStep1Task(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InitialPage.BTNTOFORM),
                Enter.theValue(credentials.getName()).into(FormStep1.TXTFIRSTNAME),
                Enter.theValue(credentials.getLastname()).into(FormStep1.TXTLASTNAME),
                Enter.theValue(credentials.getEmail()).into(FormStep1.TXTEMAIL),
                Click.on(FormStep1.SELECTMONTH),
                SelectFromOptions.byValue(credentials.getMonth()).from(FormStep1.SELECTMONTH),
                Click.on(FormStep1.SELECTDAY),
                SelectFromOptions.byValue(credentials.getDay()).from(FormStep1.SELECTDAY),
                Click.on(FormStep1.SELECTYEAR),
                SelectFromOptions.byValue(credentials.getYear()).from(FormStep1.SELECTYEAR),
                Click.on(FormStep1.TXTLENGUAGE),
                Enter.theValue(credentials.getLanguage()).into(FormStep1.TXTLENGUAGE).thenHit(Keys.ENTER),
                Click.on(FormStep1.BTNNEXT)

        );
    }

    public static FormStep1Task enterForm1(Credentials credentials){
        return Tasks.instrumented(FormStep1Task.class, credentials);
    }
}
