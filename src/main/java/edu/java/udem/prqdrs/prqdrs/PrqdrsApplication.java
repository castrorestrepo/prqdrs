package edu.java.udem.prqdrs.prqdrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PrqdrsApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(PrqdrsApplication.class, args);
          //  SpringApplication.run(PrqdrsApplication.class, args);
	}

}
