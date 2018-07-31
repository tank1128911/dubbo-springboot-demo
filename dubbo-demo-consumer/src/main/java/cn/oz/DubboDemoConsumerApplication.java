package cn.oz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@EnableDubboConfig
public class DubboDemoConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboDemoConsumerApplication.class, args);
	}
}
