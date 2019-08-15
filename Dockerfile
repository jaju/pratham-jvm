FROM java:8
COPY /src/main/java/com/tavisca/workshops/prathm /var/www/java/
WORKDIR /var/www/java
RUN javac Rover.java
RUN javac Vector.java
RUN javac RunRover.java
CMD ["java", "RunRover"] 