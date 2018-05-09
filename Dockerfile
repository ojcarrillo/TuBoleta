FROM openjdk:8-jdk-alpine
VOLUME ["/tmp","/etc/apache"]
ADD target/sandbox-microfocus-receiverMQ.jar app.jar
ENTRYPOINT java -jar app.jar

