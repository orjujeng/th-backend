FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
EXPOSE 8080
VOLUME /tmp
ADD /*.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT [ "java","-Duser.timezone='Asia/Shanghai'","-jar","/app.jar"]
