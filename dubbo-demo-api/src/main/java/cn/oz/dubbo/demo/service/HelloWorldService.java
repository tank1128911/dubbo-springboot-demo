package cn.oz.dubbo.demo.service;

import cn.oz.dubbo.demo.domain.Member;

/**
 * Created by HimuraKenShin on 2018/7/31.
 */
public interface HelloWorldService {
    Member getMemberInfo(long id, String name, int age);
}
