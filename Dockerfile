FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
EXPOSE 8080
VOLUME /tmp
ADD /target/th-backend-0.0.1-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT [ "java","-Duser.timezone='Asia/Shanghai'","-jar","/app.jar"]
