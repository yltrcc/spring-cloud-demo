
# 启动服务

* cloud-eureka-server01
* cloud-provider-payment01
* cloud-gateway-gateway

# 访问测试

* http://localhost:8001/payment/get/1

使用网关访问：
* http://localhost:9527/payment/get/1

## 使用代码配置路由访问测试

* http://localhost:9527/guonei
* http://localhost:9527/guoji

## 动态路由

启动服务 ：* cloud-provider-payment02

访问地址：http://localhost:9527/payment/get/1

## 自定义filter测试

访问地址：

* http://localhost:9527/payment/get/1?uname=z3
* http://localhost:9527/payment/get/1
