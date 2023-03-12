package cn.csrc.gov.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author HJL
 * @Date 20230308
 * @Email oxygen_subway@163.com
 * https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/
 * Request Rate Limiting、Path Rewriting
 * 这里考虑使用sentinel来限流，不用网关自身的限流功能
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GatewayApplication {
    /**
     * Attention:
     * Spring Cloud Gateway requires the Netty runtime provided by Spring Boot and Spring Webflux.
     * It does not work in a traditional Servlet Container or when built as a WAR.
     */
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
