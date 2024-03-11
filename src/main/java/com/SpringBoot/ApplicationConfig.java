package com.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("firstBean");
    }

    @Bean
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("SecondBean");
    }

    @Bean("bean3")
    //@Primary
    public MyFirstClass myThirdClass() {
        return new MyFirstClass("ThirdBean");
    }
}
