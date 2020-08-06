package com.groceryToHome.cards;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CardController {
    private CardService cardService;

    @GetMapping("/cards")
    public List<CardResponse> getCards() {
        return cardService.getCardDetails();
    }
}
