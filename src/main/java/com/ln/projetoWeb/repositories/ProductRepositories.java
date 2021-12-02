package com.ln.projetoWeb.repositories;

import com.ln.projetoWeb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {

}
