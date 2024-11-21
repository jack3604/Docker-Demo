FROM amazoncorretto:17-alpine
ARG FILE=target/
COPY ${FILE} app.jar
ENTRYPOINT ["java","-jar","src/main/java/net/ddns/adisson/dockerdemo/DockerDemoApplication.jar"]