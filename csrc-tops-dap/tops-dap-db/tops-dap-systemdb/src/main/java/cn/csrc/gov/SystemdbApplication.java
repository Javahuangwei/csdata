package cn.csrc.gov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * HJL
 * 2023/3/8
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SystemdbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemdbApplication.class, args);
    }
}
