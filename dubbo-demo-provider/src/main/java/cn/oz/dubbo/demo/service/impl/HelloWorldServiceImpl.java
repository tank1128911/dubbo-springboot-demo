package cn.oz.dubbo.demo.service.impl;

import cn.oz.dubbo.demo.domain.Member;
import cn.oz.dubbo.demo.service.HelloWorldService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by HimuraKenShin on 2018/7/31.
 */
@Service(interfaceClass = HelloWorldService.class)
@Component
public class HelloWorldServiceImpl implements HelloWorldService {
    public Member getMemberInfo(long id, String name, int age) {
        Member member = new Member(id, name, age);

        return member;
    }
}
