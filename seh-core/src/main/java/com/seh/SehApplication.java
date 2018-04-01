package com.seh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by xinhezhang on 2018/4/1.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.seh.mapper")
public class SehApplication {
    public static void main(String [] args){
        SpringApplication.run(SehApplication.class,args);
    }
}
