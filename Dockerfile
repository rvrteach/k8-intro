FROM adoptopenjdk:11-jre-hotspot
VOLUME /tmp
WORKDIR /app
ARG JAR_FILE=target/azad-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} azad-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "azad-0.0.1-SNAPSHOT.jar"]
