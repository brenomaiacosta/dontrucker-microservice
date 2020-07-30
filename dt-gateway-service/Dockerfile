FROM openjdk:11
ADD target/dt-gateway-service.jar dt-gateway-service.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar", "dt-gateway-service.jar"]