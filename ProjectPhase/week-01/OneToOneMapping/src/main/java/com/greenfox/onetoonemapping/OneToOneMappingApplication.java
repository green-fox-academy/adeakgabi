package com.greenfox.onetoonemapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.greenfox.onetoonemapping")
@SpringBootApplication
public class OneToOneMappingApplication {

  public static void main(String[] args) {
    SpringApplication.run(OneToOneMappingApplication.class, args);
  }

}
