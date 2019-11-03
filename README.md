# Outline

This is a example for building Spring Boot + Kotlin + Gradle.

This project refers [Creating a RESTful Web Service with Spring Boot](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html) page's example.   

But I updated gradle and some other grammars for latest updates(2019/11).

## To run

1. boot application
```shell script
pring-kotlin-demo on  master [!+]
➜ ./gradlew bootRun

> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.0.RELEASE)

2019-11-04 04:52:38.829  INFO 11858 --- [           main] samples.hello.ApplicationKt              : Starting ApplicationKt on AcToMiNi-no-Mac-mini.local with PID 11858 (/Users/acto_mini/dev/15_benkyo/spring-kotlin-demo/build/classes/kotlin/main started by acto_mini in /Users/acto_mini/dev/15_benkyo/spring-kotlin-demo)
2019-11-04 04:52:38.832  INFO 11858 --- [           main] samples.hello.ApplicationKt              : No active profile set, falling back to default profiles: default
2019-11-04 04:52:39.777  INFO 11858 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-11-04 04:52:39.788  INFO 11858 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-11-04 04:52:39.788  INFO 11858 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.27]
2019-11-04 04:52:39.847  INFO 11858 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-11-04 04:52:39.848  INFO 11858 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 972 ms
2019-11-04 04:52:39.999  INFO 11858 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-11-04 04:52:40.252  INFO 11858 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-11-04 04:52:40.257  INFO 11858 --- [           main] samples.hello.ApplicationKt              : Started ApplicationKt in 1.879 seconds (JVM running for 2.269)
2019-11-04 04:52:53.407  INFO 11858 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-11-04 04:52:53.407  INFO 11858 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-11-04 04:52:53.411  INFO 11858 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 4 ms
<==========---> 80% EXECUTING [28s]
> :bootRun

```

2. call API
```shell script
➜ curl http://localhost:8080/greeting\?name\=kou_cs | jq .
{
  "id": 1,
  "content": "Hello, kou_cs"
}
```

## References

- [Creating a RESTful Web Service with Spring Boot](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html)
- []()
