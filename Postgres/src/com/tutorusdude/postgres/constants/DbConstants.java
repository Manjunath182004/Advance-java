package com.tutorusdude.postgres.constants;

public enum DbConstants {

    URL("jdbc:postgresql://localhost:5432/postgres"), USER_NAME("postgres"), PASSWORD("M@nju2004"), DRIVER("org.postgresql.Driver");

    private  String value;

    DbConstants(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
