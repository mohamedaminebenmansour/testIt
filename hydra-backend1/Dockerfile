# Use an official Java runtime
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper and pom.xml
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Give the Maven wrapper permission to run (fixes Windows/Mac issues)
RUN chmod +x mvnw

# Download dependencies (this makes builds faster later)
RUN ./mvnw dependency:go-offline

# Copy your actual code
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Run the application
# Run the application
CMD ["java", "-jar", "target/hydra-backend-0.0.1-SNAPSHOT.jar"]