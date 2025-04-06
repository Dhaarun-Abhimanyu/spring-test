package dev.dhaarun_abhimanyu.todolist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@Controller
public class TodolistApplication{
  
  @Value("${server.port}")
  private int port;

	@RequestMapping("/")
  public String home() {
    return "index";
	}  

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
  }

  @PostConstruct
  public void logPort(){ 
    System.out.println("\n\n\n!!!!! Server running in http://localhost:"+port);
  }

}
