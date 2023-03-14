package com.vendorio.server.product;

import com.vendorio.server.category.Category;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        1L,
                        "Tofu65 2.0",
                        new BigDecimal("179.99"),
                        new Category(
                                1L,
                                "Keyboards",
                                "Lorem Ipsum"
                        )

                )
        );
    }
}
