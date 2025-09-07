package com.tutorusdude.methodoverriding;

import com.tutorusdude.methodoverriding.examples.*;

public class Runner {
    public static void main(String[] args) {

        Section section = new Section();
        section.belongsTo(90);
        section.belongsTo(85);
        section.belongsTo(70);
        section.resultSendTo("You are Son Got 75% in Exam");

        College college = new College();
        college.belongsTo(70);
        college.belongsTo(80);

        NonVeg nonveg = new NonVeg();
        nonveg.nonVegRate();
        nonveg.populationInIndia("kerala", 97.9);

        Chicken chicken = new Chicken();
        chicken.nonVegRate();
        chicken.populationInIndia("Tamil Nadu", 99.8);

        Language lang = new Language();
        lang.getDescription();
        lang.getTyping();
        lang.compile();
        lang.run();

        Java javaLang = new Java();
        javaLang.getDescription();
        javaLang.getTyping();
        javaLang.run();
        javaLang.compile();
    }
}
