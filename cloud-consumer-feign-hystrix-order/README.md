

# 服务降级

启动服务：
* EurekaMain01 :7001/
* PaymentHystrixMain [devtools] :8007/
* OrderHystrixMain [devtools] :80/

访问

* http://localhost/consumer/payment/hystrix/ok/1

然后干掉 PaymentHystrixMain [devtools] :8007/

在访问

* http://localhost/consumer/payment/hystrix/ok/1

# 服务熔断

