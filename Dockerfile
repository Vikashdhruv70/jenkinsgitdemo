FROM openjdk:8

ADD ./target/jenkins-0.0.1-SNAPSHOT.jar /target/jenkins-0.0.1-SNAPSHOT.jar

EXPOSE 8085

CMD java -jar /target/jenkins-0.0.1-SNAPSHOT.jar

