FROM ubuntu:18.04


ADD /target/TriangleMaven-0.0.1-SNAPSHOT.jar TriangleMaven-0.0.1-SNAPSHOT.jar

RUN apt update
RUN apt install -y openjdk-8-jdk

CMD ["java","-jar","TriangleMaven-0.0.1-SNAPSHOT.jar"]
