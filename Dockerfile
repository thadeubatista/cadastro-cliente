# Etapa de build
FROM openjdk:23-ea-21-slim-bullseye
RUN mkdir /app
WORKDIR /app
COPY target/*.jar /app/app.jar
CMD  ["java", "-jar", "/app/app.jar"]

# Etapa de execução

#600627337186.dkr.ecr.us-east-1.amazonaws.com/dev/cadastro-cliente