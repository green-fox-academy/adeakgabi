package com.greenfox.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    @Autowired
    BeansApplication(MyColor myColor){
            this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeansApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
