FROM eclipse-temurin:8-jdk-jammy

ARG HADOOP_VERSION=3.3.6

ENV DEBIAN_FRONTEND=noninteractive
ENV HADOOP_HOME=/opt/hadoop
ENV HADOOP_CONF_DIR=/opt/hadoop/etc/hadoop
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH="${PATH}:/opt/hadoop/bin:/opt/hadoop/sbin"

RUN apt-get update && apt-get install -y --no-install-recommends \
    wget \
    curl \
    ssh \
    rsync \
    python3 \
    python3-pip \
    procps \
    tini \
    && rm -rf /var/lib/apt/lists/*

RUN wget -q "https://downloads.apache.org/hadoop/common/hadoop-${HADOOP_VERSION}/hadoop-${HADOOP_VERSION}.tar.gz" -O /tmp/hadoop.tgz \
    && tar -xzf /tmp/hadoop.tgz -C /opt \
    && mv "/opt/hadoop-${HADOOP_VERSION}" /opt/hadoop \
    && rm /tmp/hadoop.tgz

RUN pip3 install --no-cache-dir mrjob

RUN mkdir -p /data/namenode /data/datanode /workspace

COPY config/ /opt/hadoop/etc/hadoop/
COPY entrypoint.sh /entrypoint.sh

RUN sed -i 's/\r$//' /entrypoint.sh \
    && find /opt/hadoop/etc/hadoop -type f -exec sed -i 's/\r$//' {} \; \
    && chmod +x /entrypoint.sh

WORKDIR /workspace

ENTRYPOINT ["/usr/bin/tini", "--", "/entrypoint.sh"]
