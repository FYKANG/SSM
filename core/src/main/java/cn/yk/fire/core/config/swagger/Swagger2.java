package cn.yk.fire.core.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: YK
 * Title: Swagger2
 * Description: swagger2配置类
 * Date: 2018/12/23
 * Time: 17:55
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("X-Access-Token").description("X-Access-Token安全验证")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("")
                .required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_12)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.yk.fire"))
                //过滤生成链接
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .useDefaultResponseMessages(false).
                        securitySchemes(Collections.singletonList(apiKey()))
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        springfox.documentation.service.Contact contact = new springfox.documentation.service.Contact("YK", "", "");
        return new ApiInfoBuilder().title("fire").description("服务端接口文档").contact(contact).version("1.0.0").build();
    }
    @Bean
    public SecurityScheme apiKey() {
        return new ApiKey("access_token", "X-Access-Token", "header");
    }
}
