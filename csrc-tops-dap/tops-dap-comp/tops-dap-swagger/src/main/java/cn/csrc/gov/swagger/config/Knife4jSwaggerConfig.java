package cn.csrc.gov.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
* @Author huangjingli
* @Date 2023-03-09
* @Desc swagger接口文档基础配置
*/
@Configuration
@EnableSwagger2WebMvc
public class Knife4jSwaggerConfig {

    @Bean
    public Docket dockerBean() {
        //指定使用Swagger2规范
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //描述字段支持Markdown语法
                        .description("# TOPS终端接口文档")
                        .termsOfServiceUrl("http://10.196.19.176")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("用户服务")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.csrc.gov"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
