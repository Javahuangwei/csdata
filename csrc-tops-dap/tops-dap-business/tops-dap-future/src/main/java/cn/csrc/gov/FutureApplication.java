package cn.csrc.gov;

import cn.csrc.gov.swagger.annotation.EnableTopsSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * HJL
 * 2023/3/8
 * 期货业务
 */
@EnableTopsSwagger
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FutureApplication {
    public static void main(String[] args) {
        SpringApplication.run(FutureApplication.class, args);
    }
}
