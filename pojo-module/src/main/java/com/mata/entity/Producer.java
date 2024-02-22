package com.mata.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产者类 这是个示例，仅作为demo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producer {
    private Long producerId;
    private String producerName;
}
