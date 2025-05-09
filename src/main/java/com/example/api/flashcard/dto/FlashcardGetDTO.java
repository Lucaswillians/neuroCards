package com.example.api.flashcard.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FlashcardGetDTO {
  private String front;
  private String back;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private int reviewCount;
  private long nextReviewTimestamp;
  private int interval;
  private double easeFactor;
}
