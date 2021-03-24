FROM java:8

EXPOSE 8096

ADD target/dockcube-first.jar dockcube-first.jar

ENTRYPOINT ["java", "-jar", "dockcube-first.jar"]
