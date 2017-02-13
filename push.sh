#!/bin/bash
### push.sh
if [ -z "${1}" ]; then
   version="latest"
else
   version="${1}"
fi
docker push mesos-dev.inframetic.com:5000/ipx-oss-config-server-docker:latest
ssh -t centos@mesos-dev.inframetic.com "sudo su - root -c 'docker pull mesos-dev.inframetic.com:5000/ipx-oss-config-server-docker:latest' "
#
