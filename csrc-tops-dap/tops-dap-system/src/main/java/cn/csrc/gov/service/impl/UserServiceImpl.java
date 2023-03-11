package cn.csrc.gov.service.impl;

import cn.csrc.gov.core.domain.R;
import cn.csrc.gov.service.UserService;
import cn.csrc.gov.systemApi.SystemClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HJL
 * 2023/3/8
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SystemClient systemClient;

    @Override
    public R<Object> selectAllUser() {
        log.info("systemClient:{}", systemClient);
        return systemClient.selectAllUser();
    }
}
