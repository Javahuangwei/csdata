package cn.csrc.gov.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @Author HJL
 * @Date
 * @Email oxygen_subway@163.com
 * @Desc 鉴权 对接CAS
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
