package com.dieauktion.inventoryservice.domain.valueobject;

import java.math.BigDecimal;
import java.util.Objects;

import com.dieauktion.inventoryservice.domain.model.Item;
import jakarta.persistence.Embeddable;

@Embeddable
public class ItemPrice extends Money {

    private BigDecimal itemPrice;

    public ItemPrice() {
        super();
    }

    @Override public String toString() {
        return "ItemPrice{" +
                "itemPrice=" + itemPrice +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        ItemPrice itemPrice1 = (ItemPrice) o;
        return Objects.equals(itemPrice, itemPrice1.itemPrice);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), itemPrice);
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemPrice(String currency, BigDecimal itemPrice) {
        super(currency);
        this.itemPrice = itemPrice;
    }
}
