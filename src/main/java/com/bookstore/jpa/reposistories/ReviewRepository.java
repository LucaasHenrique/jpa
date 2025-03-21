package com.bookstore.jpa.reposistories;

import com.bookstore.jpa.model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
