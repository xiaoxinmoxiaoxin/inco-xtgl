package com.inco.xtgl;

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



    @GetMapping("xtgl")
    public void xtgl(){
        System.out.println("xtgl");
    }
}
