FROM openjdk:8-jdk-slim
COPY "./out/artifacts/suma_jar/suma.jar" "app.suma.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.suma.jar"]