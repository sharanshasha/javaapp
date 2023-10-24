FROM eclipse-temurin:17
COPY target/javaapp.jar javaapp.jar 
CMD [ "java", "-jar", "javaapp.jar" ]