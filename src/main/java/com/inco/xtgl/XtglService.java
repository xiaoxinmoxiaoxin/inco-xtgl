package com.inco.xtgl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class XtglService {

    //sentinel的限流
    @SentinelResource(value="rongDuan",blockHandler = "xianLiuException")
    public void rongDuan(String a){
        System.out.println(a);
    }

    public void xianLiuException(String a, BlockException e){
        System.out.println(a+e);
    }


    //sentinel的降级
    @SentinelResource(value="jiangJi",fallback = "fallbackHandler")
    public void jiangJi(String a){
        System.out.println("dd");
        System.out.println(1/0);
    }

    public void fallbackHandler(String a){
        System.out.println(a);
    }

}
