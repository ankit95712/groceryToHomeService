package com.groceryToHome.cards;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    public List<CardResponse> getCardDetails() {
        List<CardResponse> cardResponseList = new ArrayList<>();
        cardResponseList.add(getcard("Orange"));
        cardResponseList.add(getcard("Banana"));
        cardResponseList.add(getcard("Grapes"));
        cardResponseList.add(getcard("Kiwi"));
        cardResponseList.add(getcard("Apple"));

        return cardResponseList;
    }

    public CardResponse getcard(String fruit) {
        return new CardResponse(fruit, "assets/download.jpg", 2, "kg", 30, 20);
    }

}


