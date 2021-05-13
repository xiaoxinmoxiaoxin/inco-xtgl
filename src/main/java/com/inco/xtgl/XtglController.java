package com.inco.xtgl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("xtgl")
public class XtglController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignTest feignTest;



    @GetMapping("xtgl")
    public void xtgl(){
        System.out.println("xtgl");
    }

    @GetMapping("xkgl")
    //@HystrixCommand(fallbackMethod = "callXkgl")
    public void xkgl(){
        feignTest.xkgl();
    }

    public void callXkgl(){
        System.out.println("系统管理调用选课管理失败");
    }
}
