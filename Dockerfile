# Use OpenJDK 17 as base image
FROM openjdk:17

# Set working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container at /app
COPY target/SpringbootApp-0.0.1-SNAPSHOT.jar /app/SpringbootApp-0.0.1-SNAPSHOT.jar

# Expose port 8080 to the outside world
EXPOSE 8080

## Command to run the Spring Boot application
CMD ["java", "-jar", "SpringbootApp-0.0.1-SNAPSHOT.jar"]
