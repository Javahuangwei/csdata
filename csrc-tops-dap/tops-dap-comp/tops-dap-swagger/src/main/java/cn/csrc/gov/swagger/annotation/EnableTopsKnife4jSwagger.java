package cn.csrc.gov.swagger.annotation;


import cn.csrc.gov.swagger.config.Knife4jSwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({Knife4jSwaggerConfig.class})
public @interface EnableTopsKnife4jSwagger {
}
