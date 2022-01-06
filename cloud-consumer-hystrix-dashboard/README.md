

启动服务访问地址：http://localhost:9001/hystrix


# 特别注意

所有Provider微服务提供类(8001/8002/8003)都需要监控依赖配置

```
   <!-- actuator监控信息完善 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```