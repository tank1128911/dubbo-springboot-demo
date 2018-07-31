package cn.oz.dubbo.demo.service.impl;

import cn.oz.dubbo.demo.domain.Member;
import cn.oz.dubbo.demo.service.HelloWorldService;
import cn.oz.dubbo.demo.service.MemberService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by HimuraKenShin on 2018/7/31.
 */
@Component("memberService")
public class MemberServiceImpl implements MemberService {
    @Reference
    private HelloWorldService helloWorldService;

    @Override
    public Member getMemberInfo() {
        Member member = this.helloWorldService.getMemberInfo(1L, "Ken", 27);

        return member;
    }
}
