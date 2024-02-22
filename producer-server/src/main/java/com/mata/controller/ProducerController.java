package com.mata.controller;

import com.mata.entity.Producer;
import com.mata.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    @GetMapping("/test")
    public Result<Producer> testGet(){
        Producer producer = new Producer(100L, "testProducerName");
        return Result.success(producer,"发送成功");
    }

    @GetMapping("/getOneProducer")
    public Producer getProducer(){
        throw new RuntimeException("get error");
        //return new Producer(100L, "testProducerName");
    }
}
