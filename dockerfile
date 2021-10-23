From java:8
Expose 8090
ADD /target/prof-ms-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]