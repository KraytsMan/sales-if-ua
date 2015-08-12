# Sales-if-ua

### Environment configuration:
***************************************************

1. java SE 1.8.

2. apache-maven-3.2.5.

3. MySql Server 5.5 (Linux command: sudo apt-get install mysql-server-5.5)

4. Node.js 
   You can download a Node.js installer for your operating system from http://nodejs.org/download/.
   Check the version of Node.js that you have installed by running the following command in console:
   
   node --version
    
5. Bower
    
   npm install -g bower
   
6. Browse required libraries
   In your console go to the {system path}/sales-if-ua/src/main/webapp/app and type following comand:
   
   bower install

### Database steps:
***************************************************

1. Create user "salesifua" with password "salesifua"
   ubuntu command - create user "salesifua"@"localhost" identified by "salesifua";
   grant all on . to "salesifua"@"localhost";
   
   mysql -u salesifua -p
   
   CREATE DATABASE salesifua character set utf8;

### Run server 
***************************************************

1. From console go to project directory
 
2. Enter command mvn jetty:run

# Home page:
1. http://localhost:8080/Practice/#/home  - Main Page


# SWAGGER documentation:
1. http://localhost:8080/Practice/api-docs
