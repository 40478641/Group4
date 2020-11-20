FROM openjdk:latest
COPY ./target/Group4.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group4.jar", "db:3306"]