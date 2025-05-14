package com.example.api.flashcard.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlashcardCreateDTO {
    private String message;
    private String front;
    private String back;
}
