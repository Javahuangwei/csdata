package cn.csrc.gov;

import cn.csrc.gov.core.annotation.EnableTopsFeignClients;
import cn.csrc.gov.swagger.annotation.EnableTopsKnife4jSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author huangjingli
 * @Date 2023-03-09
 * @Desc 系统管理模块
 */
//@EnableCustomSwagger2
@EnableTopsFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTopsKnife4jSwagger
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
