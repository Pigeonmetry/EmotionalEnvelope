package com.qgxf.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
//@MapperScan(basePackages = "com.xinke.edu.o2ostore.mapper")
//@ComponentScan(basePackages = {"com.xinke.edu.o2ostore.controller",
//        "com.xinke.edu.o2ostore.service", "com.xinke.edu.o2ostore.util",
//        "com.xinke.edu.o2ostore.config"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(
                Application.class, args);
    }

}
