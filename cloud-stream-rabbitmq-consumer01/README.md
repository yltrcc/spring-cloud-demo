

# 启动服务

* cloud-stream-rabbitmq-provider 生产者
* cloud-stream-rabbitmq-consumer01 消费者

访问测试 测试8801发送8802接收消息 ：http://localhost:8801/sendMessage

# 在启动一台消费者

* cloud-stream-rabbitmq-consumer02

访问测试 测试8801发送8802接收消息 ：http://localhost:8801/sendMessage


存在问题：
* 目前是8802/8803同时都收到了，存在重复消费问题
* 消息持久化

解决方式：分组和持久化属性group
注意在Stream中处于同一个group中的多个消费者是竞争关系，就能够保证消息只会被其中一个应用消费一次。
不同组是可以全面消费的(重复消费)，
同一组内会发生竞争关系，只有其中一个可以消费。