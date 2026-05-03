#!/bin/bash
ROOT_DIR=$(pwd)
SRC_DIR="$ROOT_DIR/src"
BUILD_DIR="$ROOT_DIR/build"
mvn clean package
if [ $? -eq 0 ]; then
   java -jar target/executable-demo-1.0-SNAPSHOT.jar
fi
