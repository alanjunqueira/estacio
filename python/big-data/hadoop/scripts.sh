#!/usr/bin/env bash
set -euo pipefail

# Sobe o container Hadoop (single-node) com NameNode/DataNode/YARN.
docker compose up -d --build

# Exibe estado dos servicos do cluster.
docker compose exec hadoop jps
docker compose exec hadoop hdfs dfs -ls /

# Executa o exemplo MapReduce e exibe no terminal.
docker compose exec hadoop python3 map-reduce.py texto_exemplo.txt

# Opcional: exibir e salvar log localmente.
# docker compose exec hadoop python3 map-reduce.py texto_exemplo.txt | tee qtd.txt