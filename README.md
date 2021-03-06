该项目的资料文件夹，包含sql文件以及疑问解决方案等。

# 微服务端口说明

## 公共模块

cloud-api-commons 

## 服务消费者
cloud-consumer-order01 - 80
cloud-consumer-zk-order - 80
cloud-consumer-consul-order - 80
cloud-consumer-feign-order - 80
cloud-consumer-feign-hystrix-order - 80
cloud-consumer-sleuth-order - 80

## Eureka 注册中心
cloud-eureka-server01 - 7001
cloud-eureka-server02 - 7002

## 服务提供者
cloud-provider-payment01 - 8001
cloud-provider-payment02 - 8002
cloud-provider-payment03 - 8003
cloud-provider-payment04 - 8004
cloud-provider-consul-payment - 8006
cloud-provider-hystrix-payment - 8007
cloud-provider-sleuth-payment - 8008

## Sentinel
cloud-alibaba-sentinel-service - 8401

## 消息队列

* 作为生产者进行发消息模块 cloud-stream-rabbitmq-provider - 8801
* 作为消息接收模块 cloud-stream-rabbitmq-consumer01 - 8802
* 作为消息接收模块 cloud-stream-rabbitmq-consumer02 - 8803


## hystrix 图形化 dashboard
cloud-consumer-hystrix-dashboard - 9001

## Nacos 作为注册中心
cloud-alibaba-provider-payment - 9101
cloud-alibaba-provider-payment02 - 9102

cloud-alibaba-consumer-nacos-order - 83

# Nacos 作为配置中心
cloud-alibaba-config-nacos-client - 3377

## 网关
cloud-gateway-gateway - 9527


# Seata
seata-order-service - 2001
seata-storage-service - 2002
seata-account-service - 2003

