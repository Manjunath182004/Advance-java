package com.tutorusdude.mysql.constants;

public enum DbConstants {

    URL("jdbc:mysql://localhost:3306/MOBILERECAHRGE"), USER_NAME("root"), PASSWORD("M@nju2004"), DRIVER("com.mysql.cj.jdbc.Driver");

    private String value;

    DbConstants(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
