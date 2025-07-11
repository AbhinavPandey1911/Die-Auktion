package com.dieauktion.inventoryservice.domain.valueobject;

import java.util.Objects;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Money {

    private String currency;

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Money money = (Money) o;
        return Objects.equals(currency, money.currency);
    }

    @Override public int hashCode() {
        return Objects.hash(currency);
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public Money(String currency) {
        this.currency = currency;
    }

}
