FROM java:8
VOLUME /logs
ADD test-docker-0.0.1-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8089
MAINTAINER huguoya<445684866@qq.com>
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
