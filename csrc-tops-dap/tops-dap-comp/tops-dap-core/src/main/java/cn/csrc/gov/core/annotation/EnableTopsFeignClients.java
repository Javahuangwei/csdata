package cn.csrc.gov.core.annotation;

import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

/**
 * @Author huangjingli
 * @Date 2023-03-09
 * @Desc 自定义Feign客户端 添加basePackages路径
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableFeignClients
public @interface EnableTopsFeignClients {
    String[] value() default {};

    String[] basePackages() default {"cn.csrc.gov"};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};
}
