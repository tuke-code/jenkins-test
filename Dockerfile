FROM java:8
VOLUME /tmp
COPY target/hello-flux-0.0.1-SNAPSHOT.jar hello-flux.jar
RUN bash -c "touch /hello-flux.jar"
# 8080 端口
EXPOSE 8080
ENTRYPOINT ["java","-jar","hello-flux.jar"]
# docker run -d -p 8080:8080 --name docker-resource demo/hello-flux:1.0
