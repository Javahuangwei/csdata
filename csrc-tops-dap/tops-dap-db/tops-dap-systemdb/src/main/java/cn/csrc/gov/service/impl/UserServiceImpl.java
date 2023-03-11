package cn.csrc.gov.service.impl;

import cn.csrc.gov.service.UserService;
import org.springframework.stereotype.Service;

/**
 * HJL
 * 2023/3/8
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String selectAllUser() {
        return "那一夜、阿珍爱上了阿强";
    }
}
