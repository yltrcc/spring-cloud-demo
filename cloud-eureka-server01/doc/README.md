
# 测试

启动服务，访问：
* http://localhost:7001/

# 单机版服务
启动以下服务：
* cloud-provider-payment01 - 服务的提供者，需要注册进 cloud-eureka-server
* cloud-consumer-order01 - 服务的消费者，需要注册进 cloud-eureka-server

访问：
* http://localhost/consumer/payment/get/31

# 集群版本服务
启动以下服务：
* cloud-eureka-server01
* cloud-eureka-server02
* cloud-provider-payment01 - 服务的提供者，需要注册进 cloud-eureka-server
* cloud-provider-payment01 - 服务的提供者，需要注册进 cloud-eureka-server
* cloud-consumer-order01 - 服务的消费者，需要注册进 cloud-eureka-server