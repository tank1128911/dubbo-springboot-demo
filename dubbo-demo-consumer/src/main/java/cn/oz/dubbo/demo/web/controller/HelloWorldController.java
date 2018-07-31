package cn.oz.dubbo.demo.web.controller;

import cn.oz.dubbo.demo.domain.Member;
import cn.oz.dubbo.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HimuraKenShin on 2018/7/31.
 */
@RestController
public class HelloWorldController {
    @Autowired
    MemberService memberService;

    @RequestMapping("/getMemberInfo")
    public Object getMemberInfo(){
        Member member = this.memberService.getMemberInfo();

        return member;
    }
}
