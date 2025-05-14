package com.example.api.flashcard.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlashcardGetDTO {
    private Long id;
    private String front;
    private String back;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int reviewCount;
    private long nextReviewTimestamp;
    private int interval;
    private double easeFactor;
}
