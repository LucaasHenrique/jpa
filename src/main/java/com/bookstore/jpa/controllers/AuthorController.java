package com.bookstore.jpa.controllers;

import com.bookstore.jpa.model.AuthorModel;
import com.bookstore.jpa.model.PublisherModel;
import com.bookstore.jpa.reposistories.AuthorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/author")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public ResponseEntity<List<AuthorModel>> getAll() {
        return ResponseEntity.ok().body(authorRepository.findAll());
    }


    @PostMapping
    public ResponseEntity<AuthorModel> saveAuthor(@RequestBody AuthorModel authorModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authorRepository.save(authorModel));
    }
}
