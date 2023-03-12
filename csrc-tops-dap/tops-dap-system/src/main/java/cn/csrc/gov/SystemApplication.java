package cn.csrc.gov;

import cn.csrc.gov.core.annotation.EnableTopsFeignClients;
import cn.csrc.gov.swagger.annotation.EnableTopsSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author huangjingli
 * @Date 2023-03-09
 * @Desc 个人中心模块
 */
@EnableTopsFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTopsSwagger
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
