package com.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    //field Injection
//    @Autowired
//    @Qualifier("bean1")
//    private MyFirstClass myFirstClass;//depedency injection(DI) using field injection Note: DI is always recommended using constructor injection

    //method injection
    private MyFirstClass myFirstClass;


    private Environment environment; //to extract environment data such as( os name,java version used)
    @Autowired //to inject environment bean to MyFirstService class
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    @Autowired
    public void injectDependencies(@Qualifier("bean3") MyFirstClass myFirstClass)
    {
        this.myFirstClass=myFirstClass;
    }

    //constructor injection
//    private final MyFirstClass myFirstClass;
//
//    public MyFirstService(@Qualifier("myThirdClass") MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }


    public String tellStory(){
        return "the dependecy is saying : "+myFirstClass.sayHello();
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }



    //scan custom property file
    @Value("${my.prop}")
    private String customPropFromAnotherFile;
    public String getCustomPropFromAnotherFile() {
        return customPropFromAnotherFile;
    }



    //Scan application.properties file
    @Value("${my.custom.property}")
    private String custom;
    public String getCustom() {
        return custom;
    }
    @Value("${my.custom.property.int}")
    public int customInt;
    public int getCustomInt() {
        return customInt;
    }

}
