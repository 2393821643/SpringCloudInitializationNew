package com.mata.clients.fallback;

import com.mata.clients.ProducerClient;
import com.mata.entity.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

@Slf4j
public class ProducerClientFallbackFactory implements FallbackFactory<ProducerClient> {
    @Override
    public ProducerClient create(Throwable cause) {
        return new ProducerClient() {
            @Override
            public Producer getProducer() {
                log.error("查询生产者异常");
                return new Producer();
            }
        };
    }
}
