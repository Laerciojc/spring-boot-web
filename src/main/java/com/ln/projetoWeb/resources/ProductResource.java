package com.ln.projetoWeb.resources;

import com.ln.projetoWeb.entities.Category;
import com.ln.projetoWeb.repositories.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepositories categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }

}
