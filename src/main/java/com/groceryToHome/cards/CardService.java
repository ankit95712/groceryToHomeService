package com.groceryToHome.cards;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    public List<CardResponse> getCardDetails() {
        List<CardResponse> cardResponseList = new ArrayList<>();
        cardResponseList.add(new CardResponse("Orange", "assets/download.jpg", 2, "kg", 30, 20));
        cardResponseList.add(new CardResponse("Banana", "assets/banana.jpg", 12, "kg", 30, 20));
        cardResponseList.add(new CardResponse("Grapes", "assets/grapes.jpg", 5, "kg", 30, 20));
        cardResponseList.add(new CardResponse("Kiwi", "assets/kiwi.jpg", 3, "kg", 30, 20));
        cardResponseList.add(new CardResponse("Apple", "assets/apple.jpg", 10, "kg", 30, 20));

        return cardResponseList;
    }



}

