package com.SpringBoot;

public class MyFirstClass {
    private String myVar;
    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }
    public String sayHello(){
        return "hello from the MyFirstClass => myVar = "+ myVar;
    }
}
