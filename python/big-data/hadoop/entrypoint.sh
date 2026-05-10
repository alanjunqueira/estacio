#!/usr/bin/env bash
set -euo pipefail

export HADOOP_HOME=/opt/hadoop
export HADOOP_CONF_DIR=/opt/hadoop/etc/hadoop
export PATH="$PATH:$HADOOP_HOME/bin:$HADOOP_HOME/sbin"
export JAVA_HOME=/opt/java/openjdk

mkdir -p /data/namenode /data/datanode

if [ ! -f /data/namenode/current/VERSION ]; then
  echo "Formatando NameNode (primeira inicializacao)..."
  hdfs namenode -format -force -nonInteractive
fi

echo "Iniciando NameNode e DataNode..."
hdfs --daemon start namenode
hdfs --daemon start datanode

echo "Iniciando ResourceManager e NodeManager..."
yarn --daemon start resourcemanager
yarn --daemon start nodemanager

echo "Cluster Hadoop pronto."
echo "NameNode UI: http://localhost:9870"
echo "YARN UI: http://localhost:8088"

tail -f /dev/null
