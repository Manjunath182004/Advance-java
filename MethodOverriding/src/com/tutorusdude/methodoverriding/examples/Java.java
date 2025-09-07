package com.tutorusdude.methodoverriding.examples;

public class Java extends Language {

    @Override
    public void getDescription() {
        System.out.println("Java is Object-Oriented programming lang");
    }

    @Override
    public void compile(){
        System.out.println("compiling java source code in javac.");
    }

    @Override
    public void run(){
        System.out.println("Executing java bytecode on the Java Virtual Machine(JVM).");
    }

    @Override
    public void getTyping() {
        System.out.println("Java uses static typing");
    }
}
