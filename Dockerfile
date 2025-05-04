FROM eclipse-temurin:21-alpine-3.21

RUN apk add maven

WORKDIR /app
COPY ./spring-boot-mvc ./spring-boot-mvc
WORKDIR ./spring-boot-mvc
RUN mvn package -Dmaven.test.skip

WORKDIR /app
COPY ./struts ./struts
WORKDIR ./struts
RUN mvn package -Dmaven.test.skip

FROM tomcat:10.1

COPY --from=0 /app/spring-boot-mvc/target/*.war /usr/local/tomcat/webapps/spring-boot-mvc.war
COPY --from=0 /app/struts/target/*.war /usr/local/tomcat/webapps/struts.war
