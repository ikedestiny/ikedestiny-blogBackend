# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set a working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/BlogBackend-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (default is 8080 for Spring Boot)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar","--server.port=8081"]
