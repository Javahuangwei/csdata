package cn.csrc.gov.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HJL
 * 2023/3/9
 */
@Slf4j
@RestController
@RequestMapping("/future")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "successful";
    }
}
