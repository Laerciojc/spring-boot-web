package com.ln.projetoWeb.repositories;

import com.ln.projetoWeb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepositories extends JpaRepository<Category, Long> {

}
