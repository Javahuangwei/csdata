package cn.csrc.gov.systemApi;

import cn.csrc.gov.core.constant.ServiceNameConstants;
import cn.csrc.gov.core.domain.R;
import cn.csrc.gov.systemApi.factory.SystemFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author huangjingli
 * @Date 20230308
 * @Desc
 */
@FeignClient(contextId = "SystemClient", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = SystemFallbackFactory.class)
public interface SystemClient {

    @GetMapping("/system/selectAllUser/")
    R<Object> selectAllUser();
}
