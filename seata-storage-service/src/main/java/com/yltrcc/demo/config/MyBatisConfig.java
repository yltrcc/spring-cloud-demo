package com.yltrcc.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Package: com.yltrcc.demo.config
 * Date：2022-01-09
 * Time：9:49
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Configuration
@MapperScan({"com.yltrcc.demo.dao"})
public class MyBatisConfig {
}