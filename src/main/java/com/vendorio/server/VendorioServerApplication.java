package com.vendorio.server;

import com.vendorio.server.category.Category;
import com.vendorio.server.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@RestController
public class VendorioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorioServerApplication.class, args);
	}

	@GetMapping
	public List<Product> hello() {
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
