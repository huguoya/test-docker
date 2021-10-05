第一种
docker build -t huguoya/test-docker:0.0.1 .
docker run --name test-docker -v /logs:/logs -d -p 8089:8089 huguoya/test-docker:0.0.1
第二种
docker run --name test-docker-2 --restart=always -d -p 8090:8089 -v /logs-x:/logs -v /home/test-docker/lib/:/home/lib/ -v /home/test-docker/test-docker-0.0.1-SNAPSHOT.jar:/home/test-docker.jar java:8 java -jar /home/test-docker.jar

mvn dependency:copy-dependencies -DoutputDirectory=.\target\lib -Dinclude
