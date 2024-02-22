package com.mata.clients;

import com.mata.clients.fallback.ProducerClientFallbackFactory;
import com.mata.entity.Producer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "producer-server", fallbackFactory = ProducerClientFallbackFactory.class)
public interface ProducerClient {
    @GetMapping("/producer/getOneProducer")
    Producer getProducer();
}
