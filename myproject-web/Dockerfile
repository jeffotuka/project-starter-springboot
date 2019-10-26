FROM openjdk:9.0.4-jre
MAINTAINER You <you@mycompany.com>
ENV APP_NAME=myproject-web

WORKDIR /app/

COPY target/${APP_NAME}.jar /app/${APP_NAME}.jar

# keep the memory configuration here so we don't forget about it.
CMD ["sh", "-c", "java -server -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1 -XshowSettings:vm -XX:+PrintFlagsFinal -jar ${APP_NAME}.jar"]
