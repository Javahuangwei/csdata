package cn.csrc.gov.systemApi.factory;

import cn.csrc.gov.core.domain.R;
import cn.csrc.gov.systemApi.SystemClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * HJL
 * 2023/3/8
 * 系统管理 降级处理
 */
@Component
public class SystemFallbackFactory implements FallbackFactory<SystemClient> {
    private static final Logger log = LoggerFactory.getLogger(SystemFallbackFactory.class);

    @Override
    public SystemClient create(Throwable cause) {
        log.error("系统管理服务调用失败:{}", cause.getMessage());
        return () -> R.fail("系统管理接口调用失败失败:" + cause.getMessage());
    }
}
