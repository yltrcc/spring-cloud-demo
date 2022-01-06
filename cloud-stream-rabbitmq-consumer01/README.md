

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