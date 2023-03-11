package cn.csrc.gov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangjingli
 * @Date
 * @Desc
 */
@RestController
@RequestMapping("/bond")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "successful";
    }
}
