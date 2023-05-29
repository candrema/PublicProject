cd Docker
docker build -t spring-boot-docker:spring-docker .
docker run -p 8080:8080 spring-boot-docker:spring-docker .
localhost:8080