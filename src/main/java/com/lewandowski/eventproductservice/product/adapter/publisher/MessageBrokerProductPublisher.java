package com.lewandowski.eventproductservice.product.adapter.publisher;

import com.lewandowski.eventproductservice.product.domain.model.Product;
import com.lewandowski.eventproductservice.product.domain.port.ProductPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
class MessageBrokerProductPublisher implements ProductPublisher {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(Product product) {
        log.info("Sending order with id: {}", product.getId());
        kafkaTemplate.send("product-local", product);
    }
}
