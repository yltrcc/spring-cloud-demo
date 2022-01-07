

# 启动服务
* NacosPaymentMain [devtools] :9101/
* NacosPaymentMain02 [devtools] :9102/
* OrderNacosMain [devtools] :83/

访问地址：
* 查看是否注册成功：两个服务，三个实例 http://127.0.0.1:8848/nacos/
* http://localhost:83/consumer/payment/nacos/1

多次访问，测试是否轮询负载
* http://localhost:83/consumer/payment/nacos/1