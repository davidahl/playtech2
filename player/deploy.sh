#!/bin/bash

mvn package
mvn install
sudo docker build -t player .
sudo docker run -p 3333:8080 player --host 0.0.0.0