package cn.csrc.gov;

import cn.csrc.gov.swagger.annotation.EnableTopsSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * HJL
 * 2023/3/8
 * 债券业务模块
 */
@EnableTopsSwagger
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BondApplication {
    public static void main(String[] args) {
        SpringApplication.run(BondApplication.class, args);
    }
}
