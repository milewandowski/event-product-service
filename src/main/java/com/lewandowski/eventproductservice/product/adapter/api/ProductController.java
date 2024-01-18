package com.lewandowski.eventproductservice.product.adapter.api;

import com.lewandowski.eventproductservice.product.domain.model.Product;
import com.lewandowski.eventproductservice.product.domain.port.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    Product get(@PathVariable String id) {
        return productService.get(id);
    }

    @GetMapping
    List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    Product create(@RequestBody final Product product) {
        return productService.create(product);
    }
}
