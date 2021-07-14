FROM maven:3.8.1-adoptopenjdk-8


ADD /target/A-Master-Example-0.0.1-SNAPSHOT.jar A-Master-Example-0.0.1-SNAPSHOT.jar

RUN apt update
RUN apt install -y openjdk-8-jdk

CMD ["java","-jar","A-Master-Example-0.0.1-SNAPSHOT.jar"]

