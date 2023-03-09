FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
#Build stage

FROM gradle:latest AS BUILD
WORKDIR /usr/app/
COPY . . 

RUN ./gradlew installDist

EXPOSE 50051

CMD ./build/install/examples/bin/zkp-server