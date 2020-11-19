package org.example.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenyufei
 * @date 2020/11/2 14:49
 */
@SpringBootApplication
@MapperScan(basePackages = "org.example.mp.mapper")
public class MP03Application {

    public static void main(String[] args) {
        SpringApplication.run(MP03Application.class, args);
    }
}
