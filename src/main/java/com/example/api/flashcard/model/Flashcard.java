package com.example.api.flashcard.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "flashcards")
@Entity(name = "Flashcard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flashcard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String front;
  private String back;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  private int reviewCount = 0;
  private long nextReviewTimestamp = 0;
  private int interval = 0;
  private double easeFactor = 2.5;

  @PrePersist
  protected void onCreate() {
    createdAt = updatedAt = LocalDateTime.now();
  }

  @PreUpdate
  protected void onUpdate() {
    updatedAt = LocalDateTime.now();
  }
}
