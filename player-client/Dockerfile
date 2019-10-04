# FROM
FROM node:latest



COPY . /usr/src/app

ENV DOCKER_HOST=''

# WORKDIR
WORKDIR /usr/src/app

ENTRYPOINT ["node", "/usr/src/app/playerclient.js"]