package com.gp.gpmybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gp.gpmybatisplusdemo")
public class GpmybatisplusdemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(GpmybatisplusdemoApplication.class, args);
  }

}
