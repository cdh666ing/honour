package com.duheng.study.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static int i = 0;
    @GetMapping("/test")
    public String test(){
        synchronized (this){
            try {
                i++;
                System.out.println(i);
                System.out.println("线程名称："+Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return String.valueOf(i);
    }

}
