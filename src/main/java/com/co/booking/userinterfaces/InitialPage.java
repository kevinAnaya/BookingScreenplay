package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InitialPage {

    public static  final Target BTNTOFORM = Target.the("btn to form")
            .locatedBy("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a");
}
