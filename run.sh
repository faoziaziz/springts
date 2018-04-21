#!/bin/sh
mvn dependency:go-offline
mvn -o tomcat7:run
