FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY . .

# ✅ FIX: give permission to mvnw
RUN chmod +x mvnw

# Build project
RUN ./mvnw clean install -DskipTests

EXPOSE 8081

CMD ["java", "-jar", "target/backend-0.0.1-SNAPSHOT.jar"]