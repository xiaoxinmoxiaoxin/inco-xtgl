package com.inco.xtgl;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "INCO-XKGL",fallback = FeignTestFallBack.class)
public interface FeignTest {
    @GetMapping("/xkgl/xkgl")
    String xkgl();
}