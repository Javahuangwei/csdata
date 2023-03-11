package cn.csrc.gov;

import cn.csrc.gov.swagger.annotation.EnableTopsKnife4jSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * HJL
 * 2023/3/8
 * 债券业务模块
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTopsKnife4jSwagger
public class BondApplication {
    public static void main(String[] args) {
        SpringApplication.run(BondApplication.class, args);
    }
}
