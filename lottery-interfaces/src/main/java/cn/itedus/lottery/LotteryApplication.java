package cn.itedus.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
@SpringBootApplication
@Configuration
@EnableDubbo
public class LotteryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
    }
}
