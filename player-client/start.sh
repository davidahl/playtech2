#!/bin/bash

export DOCKER_HOST=$(ip -4 addr show docker0 | grep -Po 'inet \K[\d.]+')
sudo docker build -t client .
sudo docker run -it -e DOCKER_HOST=${DOCKER_HOST} client sh