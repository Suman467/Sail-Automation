FROM adoptopenjdk:8-jdk-hotspot

WORKDIR /app
COPY . /app

CMD ["./mvnw", "test"]
