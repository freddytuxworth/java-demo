# Diffblue Java Demo repository

This project contains sample Java code for the Diffblue Test Generation service.

Add this project to the system to generate sample unit tests

To work with the Mongo connection the following docker command will setup the DB:
`docker run -p 27017:27017 -d mongo:latest`

Copyright 2016-2018 Diffblue limited. All rights reserved.


## FAT JAR verification 

to build the fat JAR 

```
mvn package -Dmaven.test.skip 
```

The classpath 

```
echo "`find / "$PWD" -name "java-demo-1.0.0-with-dependencies.jar"`:" | head -1
````