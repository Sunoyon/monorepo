FROM openjdk:11.0.9-jre-slim

ARG JAR_FILE
COPY target/${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
CMD ["--spring.config.location=classpath:/application.properties"]