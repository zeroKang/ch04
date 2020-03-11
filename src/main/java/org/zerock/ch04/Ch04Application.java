package org.zerock.ch04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Ch04Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch04Application.class, args);
	}

}
