package com.bookstore.jpa.controllers;

import com.bookstore.jpa.model.AuthorModel;
import com.bookstore.jpa.model.PublisherModel;
import com.bookstore.jpa.reposistories.AuthorRepository;
import com.bookstore.jpa.reposistories.PublisherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/publisher")
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping
    public ResponseEntity<List<PublisherModel>> getAll() {
        return ResponseEntity.ok().body(publisherRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<PublisherModel> saveAuthor(@RequestBody PublisherModel publisherModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(publisherRepository.save(publisherModel));
    }
}
