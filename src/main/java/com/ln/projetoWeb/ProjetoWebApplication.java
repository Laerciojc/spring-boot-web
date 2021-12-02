package com.ln.projetoWeb;

import com.ln.projetoWeb.entities.Category;
import com.ln.projetoWeb.entities.Product;
import com.ln.projetoWeb.repositories.CategoryRepositories;
import com.ln.projetoWeb.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProjetoWebApplication  implements CommandLineRunner {

	@Autowired
	private CategoryRepositories categoryRepositories;

	@Autowired
	private ProductRepositories productRepositories;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");

		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(null, "PS5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));

		categoryRepositories.save(cat1);
		categoryRepositories.save(cat2);

		productRepositories.save(p1);
		productRepositories.save(p2);
		productRepositories.save(p3);
		productRepositories.save(p4);


	}
}
