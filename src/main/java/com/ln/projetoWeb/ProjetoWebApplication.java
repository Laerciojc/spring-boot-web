package com.ln.projetoWeb;

import com.ln.projetoWeb.entities.Category;
import com.ln.projetoWeb.repositories.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoWebApplication  implements CommandLineRunner {

	@Autowired
	private CategoryRepositories categoryRepositories;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");

		categoryRepositories.save(cat1);
		categoryRepositories.save(cat2);
	}
}
