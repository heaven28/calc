FROM openjdk:8
COPY ./target/Lab3Junit-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientific_calculator-1.0-SNAPSHOT.jar", "com/example/scientificcalculator/MainApplication"]
