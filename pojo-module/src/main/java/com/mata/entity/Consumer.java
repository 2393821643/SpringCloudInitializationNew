package com.mata.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消费者类 这是个示例，仅作为demo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Consumer {
    private Long consumerId;
    private String consumerName;
    private Long producerId;
    private String producerName;
}
