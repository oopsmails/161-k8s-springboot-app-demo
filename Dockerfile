FROM openjdk:15-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-1.0.0.jar
# This cannot be used as 3.0.k8s-using-volume-git.yml will define git repo as config
# ADD ./src/main/config /data/config
# This can be defined in application.properties, server.port=8888
# EXPOSE 8080
# Use this 3.0.k8s-using-volume-git.yml will copy to /config
ENTRYPOINT ["java","-Dspring.config.location=/config/","-jar","/demo-1.0.0.jar"]
