
# springboot-company-app

Minimal Rest-api [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [Tomcat 9](https://tomcat.apache.org/download-90.cgi)
- [Postgresql 14](https://www.postgresql.org/download/)

## Dependencies

```shell
Spring Web
Spring Data JPA
PostgreSQL Driver
Lombok
```

## Postman Test Examples
Testing the product table for CRUD operations

Create
![create](https://i.ibb.co/zFvLp1R/Create-Product.png)

Read
![Read/getall](https://i.ibb.co/k0Ln23C/Get-All-Product.png)
![Read/getById](https://i.ibb.co/bLcy05G/get-Prodyct-By-Id.png)

Update
![Update](https://i.ibb.co/1zM7gvx/Update-Product.png)

Delete
![Delete](https://i.ibb.co/H4hx1fm/Delete-Product.png)

## Postgresql Database
Database Check
![enter image description here](https://i.ibb.co/ZNDCpGK/Postgresql-Database-Check.png)
## Deploy To Apache Tomcat
After the package is selected as war, this command is typed into the terminal.
```shell
mvn clean install
```

After that the resulting snapshot file "company-app" is placed under the webapp folder to deploy on Tomcat
Finally, Tomcat server is run and tests are found below.

Tomcat Server in Port 9090:
![Tomcat](https://i.ibb.co/GpyHJFY/Tomcat.png)

Tomcat Web Application Manager:
![Tomcat Manager](https://i.ibb.co/rF15Tsx/Tomcat-Manager.png)

Test GetAll/GetById:
![GetAllProducts](https://i.ibb.co/kKQwcp6/Tomcat-Get-All-Products.png)![GetById](https://i.ibb.co/tLHtpfq/Tomcat-Get-By-Id.png)
