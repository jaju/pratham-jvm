FROM java:8  
COPY build/libs/pratham.jar /var/www/java/ 
WORKDIR /var/www/java/  
RUN chmod 777 pratham.jar
CMD ["java","-jar", "pratham.jar"]