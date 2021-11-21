FROM openjdk:14.0.2
ENV JAVA_OPTS -Xmx300m -Xms80m -XX:MaxMetaspaceSize=200m
COPY target/*-shaded.jar app.jar
EXPOSE 80
CMD java ${JAVA_OPTS} -Dmicronaut.server.port=80 -Dmicronaut.config.files=/codenow/config/application.yaml  -Dlogback.configurationFile=logback-codenow.xml  -jar app.jar