package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormStep1 {

    public static  final Target TXTFIRSTNAME = Target.the("first name")
            .locatedBy("//input[@id=\"firstName\"]");

    public static  final Target TXTLASTNAME = Target.the("last name")
            .locatedBy("//input[@id=\"lastName\"]");

    public static  final Target TXTEMAIL = Target.the("email")
            .locatedBy("//input[@id=\"email\"]");


    public static  final Target SELECTMONTH = Target.the("btn month")
            .locatedBy("//select[@id=\"birthMonth\"]");

    public static  final Target SELECTDAY = Target.the("btn day")
            .locatedBy("//select[@id=\"birthDay\"]");

    public static  final Target SELECTYEAR = Target.the("btn year")
            .locatedBy("//select[@id=\"birthYear\"]");


    public static  final Target TXTLENGUAGE = Target.the("txt lenguage")
            .locatedBy("//input[@type=\"search\"]");

    public static final Target BTNNEXT = Target.the("btn next form")
            .locatedBy("//button[@class=\"btn btn-blue\"]");

}


