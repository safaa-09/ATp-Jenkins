FROM maven:3.8.1-adoptopenjdk-8


ADD /target/A-Master-Example-0.0.1-SNAPSHOT.jar A-Master-Example-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","A-Master-Example-0.0.1-SNAPSHOT.jar"]

