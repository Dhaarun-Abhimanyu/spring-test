package dev.dhaarun_abhimanyu.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
@SpringBootApplication
public class TodolistApplication {

	@RequestMapping("/")
  public String home() {
    return "index";
	}
  
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
  }

}
