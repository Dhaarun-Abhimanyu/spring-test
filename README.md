# spring-test

Trying spring applications for fun!

## Table of Contents

1. [Quick Notes](#quk_not)
   1. [Maven vs Gradle](#mvn_gdl)
   2. [Spring and Spring boot](#spr_spb)
2. [Important Commands](#imp_cmd)

## Quick Notes

Some useful stuff i found about while developing the spring application
<a id= "quk_not" ></a>

### Maven vs Gradle

(imo)
Maven is a build tool, more like a configuration file - the dependencies and stuff are in the `pom.xml`. Gradle also does the same job, but its in `build.gradle`
But i believe gradle offers more - its a proper scripting language - one can go upto writing CI/CD pipelines in it(source - reddit)

### Spring and Spring boot

Spring is the actual framework(framework being a skeleton on vanilla java, that provides a lot of configuration out of the box - say handling http requests)

Spring boot is like a tool built on top of the spring framework that saves a lot of time and boilerplate - it provides auto configuration, embedded servers(like **tomcat**, **jetty** and **undertow**) and some production ready features(imo, it seems like `npx create-react-app` that comes in with some ready to use code)

## Important Commands

1. `./mvnw clean install` - for install dependencies
2. `./mvnw spring-boot:run` - for running the spring boot project
3. `./mvnw dependency:tree` - for viewing the dependency tree

<a id="imp_cmd"></a>

