package cn.csrc.gov.controller;

import cn.csrc.gov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HJL
 * 2023/3/8
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/system/selectAllUser/")
    public String selectAllUser() {
        return userService.selectAllUser();
    }
}
