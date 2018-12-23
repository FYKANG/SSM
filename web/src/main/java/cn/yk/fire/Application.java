package cn.yk.fire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Author: YK
 * Title: Application
 * Description: springBoot启动类
 * Date: 2018/12/20
 * Time: 17:21
 */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class Application {
    public static void main (String[] args){
        SpringApplication.run(Application.class, args);
    }
}
