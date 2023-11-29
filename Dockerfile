# Dockerfile -

FROM openjdk:17  
RUN mkdir /usr/app/ 
COPY /target/Karthigai_App.war /usr/app 
WORKDIR /usr/app/ 
ENTRYPOINT [ "java","-jar","Karthigai_App.war" ]