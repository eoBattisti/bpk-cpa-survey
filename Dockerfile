FROM maven:3.9.0 AS maven

WORKDIR /usr/src/app
COPY . /usr/src/app

ENTRYPOINT ["mvn", "package"]
#RUN sleep 90000
#RUN mvn install
#
#RUN mvn spring-boot:run

#FROM adoptopenjdk/openjdk11:alpine-jre
#
#ARG JAR_FILE=cpa-0.0.1-SNAPSHOT.jar
#
#WORKDIR /opt/app
#
#COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/
#
#ENTRYPOINT ["java","-jar","cpa-0.0.1-SNAPSHOT.jar"]