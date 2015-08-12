# Sales-if-ua

### must to be installed next things:
***************************************************

1. java SE 1.8.

2. apache-maven-3.2.5.

3. MySql Server 5.5 (Linux command: sudo apt-get install mysql-server-5.5)

### Database steps:
***************************************************

1. Create user "salesifua" with password "salesifua"
   ubuntu command - create user "salesifua"@"localhost" identified by "salesifua";
   grant all on . to "salesifua"@"localhost";
   
   mysql -u salesifua -p
   
   CREATE DATABASE salesifua character set utf8;

#Install Node.js
Node is a requirement for bower package manager.
You can download a Node.js installer for your operating system from http://nodejs.org/download/.
Check the version of Node.js that you have installed by running the following command in console:
```sh
 node --version
```

#Install Bower
Bower is used for bootstrapping application with needed libraries like Angular.js, jQuery etc.

#Browse required libraries
In your console go to the {system path}/sales-if-ua/src/main/webapp/app and type following comand:


### Run server 
***************************************************

1. From console go to project directory
 
2. Enter command mvn jetty:run

#Start page link:
1. http://localhost:8080/Practice/#/home  - Main Page


#Links for using SWAGGER documentation:
1. http://localhost:8080/Practice/api-docs
