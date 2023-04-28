FROM openjdk:17
ADD build/libs/CircuitBreakerServer-0.0.1-SNAPSHOT.jar CircuitBreakerServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "CircuitBreakerServer-0.0.1-SNAPSHOT.jar"]
EXPOSE "8081"