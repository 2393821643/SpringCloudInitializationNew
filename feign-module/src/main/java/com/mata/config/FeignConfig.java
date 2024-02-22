package com.mata.config;

import com.mata.clients.fallback.ProducerClientFallbackFactory;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
    @Bean
    public ProducerClientFallbackFactory producerClientFallbackFactory(){
        return new ProducerClientFallbackFactory();
    }

}
