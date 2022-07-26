FROM openjdk:15-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-1.0.0.jar
ADD ./src/main/config /data/config
# This can be defined in application.properties, server.port=8888
# EXPOSE 8080
#ENTRYPOINT ["java","-jar","/demo-1.0.0.jar"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-1.0.0.jar"]
ENTRYPOINT ["java","-Dspring.config.location=/data/config/","-jar","/demo-1.0.0.jar"]
