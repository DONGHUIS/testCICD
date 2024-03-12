FROM amazoncorretto:17
EXPOSE 8099
COPY target/*.war SpringBootApp.war
ENTRYPOINT [ "java","-jar", "SpringBootApp.war"]

##FROM amazoncorretto:17  war파일을 동작시킬 base image
##EXPOSE 내부에서 연결할 포트
##COPY target/*.war SpringBootApp.war 프로젝트에서 war(SpringBootApp.war)를 복사해서 사용될 아카이브파일을 복제
##ENTRYPOINT [ "java"," -jar", " SpringBootApp.war"] 컨테이너가 실행될 때 먼저 수행되는 명령어의 배열
##VOLMUE ["c:\education","/etc/htdocs"]

#FROM ubuntu
#Run apt-get update && apt-get install -y openjdk-17-jdk git maven unzip

#만약에 외부에서 제공하는 파일을 ADD로 가져오기 **** 외부에서 가져온 파일은 압축을 자동으로 해제해주지 않음
#ADD Https://github.com/springTest/archive/target/main.zip /home/spring
#ADD apatch-tomcat-9.0.28.tar.gz /home/tomcat
#RUN unzip /home/spring/main.zip -d /home/spring
#RUN maven -f /home/spring/springtest-main/HelloSpring/target/*.war /home/tomcat/apatch-tomcat-9.0.28/webapps/
#WORKDIR /home
#EXPOSE 8080
#ENTRYPOINT [ "/home/tomcat/apatch-tomcat-9.0.28/bin/catalina.sh","run"]