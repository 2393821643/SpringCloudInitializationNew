package com.mata.controller;

import com.mata.clients.ProducerClient;
import com.mata.entity.Consumer;
import com.mata.entity.Producer;
import com.mata.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ProducerClient producerClient;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/getOneConsumer")
    private Result<Consumer> getOneConsumer(){
        stringRedisTemplate.opsForValue().set("testKey","it is redis",2, TimeUnit.MINUTES);
        Producer producer = producerClient.getProducer();
        Consumer consumer = Consumer.builder()
                .consumerId(5L)
                .consumerName("testConsumerName")
                .producerId(producer.getProducerId())
                .producerName(producer.getProducerName())
                .build();
        return Result.success(consumer,"获取成功");
    }
}
