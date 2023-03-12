package cn.csrc.gov.gateway.config;

import cn.csrc.gov.gateway.handler.SentinelFallbackHandler;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import com.alibaba.csp.sentinel.adapter.gateway.sc.SentinelGatewayFilter;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author HJL
 * @Date 20230308
 * @Email oxygen_subway@163.com
 * 实现sentinel限流配置
 */

@Configuration
public class GatewayConfig {
    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SentinelFallbackHandler sentinelGatewayExceptionHandler() {
        return new SentinelFallbackHandler();
    }

    @Bean
    @Order(-1)
    public GlobalFilter sentinelGatewayFilter() {
        return new SentinelGatewayFilter();
    }

    @PostConstruct
    public void doInit() {
        // 加载网关限流规则
        initGatewayRules();
    }

    /**
     * 网关限流规则
     */
    private void initGatewayRules() {
        Set<GatewayFlowRule> rules = new HashSet<>();
        rules.add(new GatewayFlowRule("tops-dap-system")
                .setCount(3) // 限流阈值
                .setIntervalSec(10)); // 统计时间窗口，单秒位是秒，默认是 1
        //测试验证，一分钟内访问三次系统服务出现异常提示表示限流成功
        // 加载网关限流规则
        GatewayRuleManager.loadRules(rules);
    }
}