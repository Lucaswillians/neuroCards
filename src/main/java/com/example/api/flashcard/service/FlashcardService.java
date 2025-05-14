package com.example.api.flashcard.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.flashcard.dto.FlashcardCreateDTO;
import com.example.api.flashcard.dto.FlashcardGetDTO;
import com.example.api.flashcard.model.Flashcard;
import com.example.api.flashcard.repository.FlashcardRepository;
import java.util.List;

@Service
public class FlashcardService {
  @Autowired
  private FlashcardRepository repository;

  public FlashcardCreateDTO postCreateFlashcard (FlashcardCreateDTO flashcardCreateDTO) {
    Flashcard flashcard = new Flashcard();
    flashcard.setFront(flashcardCreateDTO.getFront()); 
    flashcard.setBack(flashcardCreateDTO.getBack());

    Flashcard savedFlashcard = repository.save(flashcard);

    return new FlashcardCreateDTO( "Flashcard successfully created!", savedFlashcard.getFront(), savedFlashcard.getBack());
  }

  public List<FlashcardGetDTO> getAllFlashcard () {
    List<Flashcard> flashcards = repository.findAll();

    return flashcards.stream().map(fcard -> new FlashcardGetDTO(
        fcard.getId(), fcard.getFront(), fcard.getBack(),                    
        fcard.getCreatedAt(), fcard.getUpdatedAt(), fcard.getReviewCount(),             
        fcard.getNextReviewTimestamp(), fcard.getInterval(), fcard.getEaseFactor())).collect(Collectors.toList());
  };
}
