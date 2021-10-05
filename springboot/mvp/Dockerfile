FROM openjdk:11.0.12-jre-slim-buster

WORKDIR /app

RUN groupadd --gid 1001 spring && useradd --uid 1001 --gid spring --shell /bin/bash spring  

USER spring:spring

COPY target/jsb-0.0.1-SNAPSHOT.jar .

EXPOSE 10300

ENTRYPOINT ["java","-jar","jsb-0.0.1-SNAPSHOT.jar"]