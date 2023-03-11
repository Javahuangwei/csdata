package cn.csrc.gov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangjingli
 * @Date 20230309
 * @Desc 档案检索控制器
 */
@RestController
@RequestMapping("/archivesRetrieval")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "successful";
    }
}
