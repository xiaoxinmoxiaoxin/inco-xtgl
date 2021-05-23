package com.inco.xtgl;

import com.alibaba.cloud.sentinel.datasource.config.NacosDataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RefreshScope
@RequestMapping("xtgl")
public class XtglController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignTest feignTest;

    @Autowired
    private XtglService xtglService;
    //@Value("${test:1}")
    private String test;

    @GetMapping("xtgl")
    public void xtgl(){
        //xtglService.rongDuan("hhhhhhhh");
       // xtglService.jiangJi("yyyyyyyy");
        String str=null;
        NacosDataSourceProperties a=null;

       // str.equals("111");

    }

    //@HystrixCommand(fallbackMethod = "callXkgl")//优先级更高
    @GetMapping("xkgl")
    public void xkgl(){
        feignTest.xkgl();
    }

    public void callXkgl(){
        System.out.println("系统管理调用选课管理失败");
    }
}
