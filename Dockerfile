FROM public.ecr.aws/amazoncorretto/amazoncorretto:11
EXPOSE 8080
VOLUME /tmp
ADD target/*.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT [ "java","-jar","/app.jar"]