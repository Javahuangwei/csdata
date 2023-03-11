package cn.csrc.gov;

import cn.csrc.gov.swagger.annotation.EnableTopsKnife4jSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Date 2023/3/7
 * @Author HJL
 * @Desc 股票质押模块
 */
@EnableTopsKnife4jSwagger
@SpringBootApplication
public class StockPledgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockPledgeApplication.class, args);
    }
}
