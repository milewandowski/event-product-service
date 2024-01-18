package com.lewandowski.eventproductservice.product.domain.port;

import com.lewandowski.eventproductservice.product.domain.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public final class ProductService {

    private final ProductRepository productRepository;
    private final ProductPublisher productPublisher;

    public Product get(String id) {
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        Product savedProduct = productRepository.save(product);
        productPublisher.send(savedProduct);

        return savedProduct;
    }
}
