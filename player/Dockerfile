FROM java:8-jdk-alpine
COPY ./target/player-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
RUN ifconfig
ENTRYPOINT ["java", "-jar", "player-0.0.1-SNAPSHOT.jar"]