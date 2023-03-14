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
public class VendorioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorioServerApplication.class, args);
	}

}
