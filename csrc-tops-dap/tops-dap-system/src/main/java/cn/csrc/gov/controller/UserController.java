package cn.csrc.gov.controller;

import cn.csrc.gov.core.domain.R;
import cn.csrc.gov.service.UserService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HJL
 * 2023/3/8
 */
@Slf4j
@RestController
@RequestMapping("/system")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectAllUser")
    @ApiOperation(value = "查询全量用户")
    @ApiOperationSupport(author = "huangjingli")
    public R<Object> selectAllUser() {
        return userService.selectAllUser();
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
