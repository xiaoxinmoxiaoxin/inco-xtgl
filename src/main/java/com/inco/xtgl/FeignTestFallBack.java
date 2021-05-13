package com.inco.xtgl;

import org.springframework.stereotype.Component;

@Component
public class FeignTestFallBack implements FeignTest{

    @Override
    public String xkgl() {
        System.out.println("系统管理调用选课管理失败，接口中回退");
        return null;
    }
}
