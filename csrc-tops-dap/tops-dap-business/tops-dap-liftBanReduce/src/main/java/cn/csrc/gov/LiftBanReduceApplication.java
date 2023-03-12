package cn.csrc.gov;

import cn.csrc.gov.swagger.annotation.EnableTopsSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * HJL
 * 2023/3/8
 * 解禁减持业务
 */
@EnableTopsSwagger
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LiftBanReduceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiftBanReduceApplication.class, args);
    }
}
