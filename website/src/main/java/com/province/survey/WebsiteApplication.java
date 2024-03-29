package com.province.survey;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhangbingquan
 * @version 2019年09月10日
 * @since 2019年09月10日}
 **/
@SpringBootApplication
@Slf4j
@EnableSwagger2
@MapperScan(value = "com.province.survey.dao")
public class WebsiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
    }
}
