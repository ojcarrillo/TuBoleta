#!/bin/bash
echo "======================================================="
echo "inicia instalacion contenedor!"
echo "======================================================="
echo "compila aplicacion"
mvn clean package -Dmaven.test.skip=true
echo "======================================================="
echo "======================================================="
echo "compila imagen docker - terceros_tuboleta"
docker build -t terceros_tuboleta .
echo "======================================================="
echo "======================================================="
echo "corre imagen del contenedor"
docker run \
 --name terceros_tuboleta \
 -p 9091:8080 \
 -v /volume/docker/tuboleta/tmp:/tmp  \
 -v /volume/docker/tuboleta/log:/var/netgloo_blog/logs/application.log  \
 terceros_tuboleta
echo "======================================================="
echo "======================================================="
echo "fin"
exit
