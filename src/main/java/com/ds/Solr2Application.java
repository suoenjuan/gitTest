package com.ds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ds.dao")
public class Solr2Application {

    public static void main(String[] args) {
        SpringApplication.run(Solr2Application.class, args);
    }
}
