# Allure Test Report Generator And Serve

This will generate reports from the allure-results to allure-report

* To Build Application

> For Linux/Mac
> ./gradlew build -x test

* For Windows
> gradle build -x test

* To Run Application [In Build/Libs folder]

> java -jar [Jarfile] [-Dconfig=application.properties]

Passing application.properties is optional
This opens a tomcat server with 9000 ports as default.
* To generate reports and update server 
  
> http://[IPAddress]:9000/refresh
  
> http://localhost:9000/refresh

Localhost can be replaced with a IP Address. 
"refresh" is the api call which will generate the results
