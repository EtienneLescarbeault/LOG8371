# MangoDB
Primarily used to manage sensor data, this piece of software offers many functionalities to process the data, query it, generate informative reports as well as monitoring the points (the sensors) received to alert the users. 

## Reports
This feature allows to:
- query a set of points given a time range
- send the report to a mailing list and/or other users
- create and manage reports query templates

## How to install on Windows
- Download the required software: apache-ant, apache-tomcat, mangoDB, mangaSource, java 8 JDK
- Edit the system environment variables by adding apache-ant and java-home
- Configure tomcat
- Configure mango's build properties file
- See MangoDB's official website for more details

## How to quickstart
- Run startup.sh in tomcat's bin folder
- Open the mangoSource folder
- Open powershell
- Type 'ant fullDeploy'
- Type 'ant reload'
- Navigate to mangodb via http://localhost:8080/test