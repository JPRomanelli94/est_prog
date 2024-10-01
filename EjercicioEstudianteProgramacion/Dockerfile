FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/EjercicioEstudianteProgramacion-0.0.1.jar
COPY ${JAR_FILE} app_EjercicioEstudianteProgramacion.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_EjercicioEstudianteProgramacion.jar"]