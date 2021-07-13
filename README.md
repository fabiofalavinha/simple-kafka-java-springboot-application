# simple-kafka-java-springboot-application

## Installing Kafka @ Mac OS

Using brew to install kafka

$ brew install kafka


## Starting locally (not as daemon) Zookeeper & Kafka

$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties

and

$ kafka-server-start /usr/local/etc/kafka/server.properties

Reference link: https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273

## Start Spring Boot Application with Kafka

java -jar demo.kafka.jar
