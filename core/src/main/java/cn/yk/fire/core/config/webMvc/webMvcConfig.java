package cn.yk.fire.core.config.webMvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Author: YK
 * Title: webMvcConfig
 * Description: webMvc配置类
 * Date: 2018/12/23
 * Time: 16:07
 */
@Configuration
public class webMvcConfig implements WebMvcConfigurer {

    /**
     * 跨域设置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                //允许跨域的路径
                .addMapping("/**")
                //允许跨域的请求header访问
                .allowedHeaders("*")
                //允许跨域的请求方式
                .allowedMethods("*")
                //允许跨域的域名
                .allowedOrigins("*");
    }

    /**
     * 消息转换器设置
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }
}
