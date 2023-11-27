package com.lewandowski.eventproductservice.product.domain.port;

import com.lewandowski.eventproductservice.product.domain.model.Product;

public interface ProductPublisher {

    void send(Product product);
}
