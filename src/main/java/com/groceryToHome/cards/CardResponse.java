package com.groceryToHome.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CardResponse {
    private String header;
    private String imageUrl;
    private int quantity;
    private String metrics;
    private int marketPrice;
    private int price;
}
