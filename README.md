# spring-test

Trying spring applications for fun!

## Table of Contents

1. [Quick Notes](#quk_not)
   1. [Maven vs Gradle](#mvn_gdl)
   2. [Spring and Spring boot](#spr_spb)
2. [Important Commands](#imp_cmd)
3. [Annotations](#ann)

## Quick Notes

Some useful stuff i found about while developing the spring application
<a id= "quk_not" ></a>

### Maven vs Gradle

(imo)
Maven is a build tool, more like a configuration file - the dependencies and stuff are in the `pom.xml`. Gradle also does the same job, but its in `build.gradle`
But i believe gradle offers more - its a proper scripting language - one can go upto writing CI/CD pipelines in it(source - reddit)

#### Maven concepts
- clean : cleans the target folder
- compile, test, package, verify - does as the name says

example command: `./mvnw clean verify` - kind of like a stack: verify does all the previous commands too - compile, test and package.

<a id = "mvn_gdl" ></a>

### Spring and Spring boot

Spring is the actual framework(framework being a skeleton on vanilla java, that provides a lot of configuration out of the box - say handling http requests)

Spring boot is like a tool built on top of the spring framework that saves a lot of time and boilerplate - it provides auto configuration, embedded servers(like **tomcat**, **jetty** and **undertow**) and some production ready features(imo, it seems like `npx create-react-app` that comes in with some ready to use code)

<a id = "spr_spb" ></a>

#### Spring App layers
##### Presentation
Contains the controllers that interact with the client

##### Service
Contains services that the controller interacts with to push to the databases

##### Persistance
Handles interaction with databases using 'entities', that is, the java objects. Two common patterns to do it are Repositories, and DAOs(Data Access Objects). Done using interfaces, so that even if the Persistance layer changes completely, the functions used in the interfaces are still the same.

#### Spring Beans
A bean in Spring is just a managed object that the framework creates, injects, and manages for you.
You use beans to enable dependency injection, reduce boilerplate, manage app components cleanly, and follow best practices like loose coupling and modular design.

Check out [this](https://github.com/devtiro/course-spring-boot/tree/main/4_dependency_injection) to get an idea about the use of beans

In short, no need to change the code in case of change of dependencies(Spring automatically handles dependency injection)

#### Dependency injection / Auto wiring:
Spring automatically 'scans' the project for beans(one can call this **component scanning**). If the bean requires dependencies, spring then searches its context to check if it has those dependencies(or ig beans here). If it does, it then "injects" those beans here, hence known as dependency injection. "Auto wiring" means the same thing, its just a term that refers to dependency injection specifically in spring.

## Important Commands

1. `./mvnw clean install` - for install dependencies
2. `./mvnw spring-boot:run` - for running the spring boot project
3. `./mvnw dependency:tree` - for viewing the dependency tree

<a id="imp_cmd"></a>

## Annotations

- `@Configuration` : config files for the project. Spring will check for any required configuration from these(say any beans to be loaded)
- `@Bean` : For declaring a bean(method returns an object)
- `@SpringBootApplication` : Main spring file ig
- `@Controller` : to define a class as a controller
- `@Value` : to get a value from 'application.properties'
- `@Component` : for now, ik its an annotation to declare a class as a bean(similar to using @Bean in a method in an @Configuration class)


