package com.lewandowski.eventproductservice.product.domain.port;

import com.lewandowski.eventproductservice.product.domain.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
