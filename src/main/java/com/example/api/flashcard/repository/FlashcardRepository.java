package com.example.api.flashcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.flashcard.model.Flashcard;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> { }
