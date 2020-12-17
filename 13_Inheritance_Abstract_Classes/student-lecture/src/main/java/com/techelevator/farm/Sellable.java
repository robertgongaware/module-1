package com.techelevator.farm;

import java.math.BigDecimal;

public interface Sellable {
    String getName(); //abstract methods. ONLY has abstaract methods
    BigDecimal getPrice();
}