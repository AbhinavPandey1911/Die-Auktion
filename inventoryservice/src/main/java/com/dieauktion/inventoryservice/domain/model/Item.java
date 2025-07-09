package com.dieauktion.inventoryservice.domain.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.dieauktion.inventoryservice.domain.globalenum.Category;
import com.dieauktion.inventoryservice.domain.valueobject.ItemPrice;

public class Item {

    private final Long itemID;
    private String itemName;
    private String itemDescription;
    private List<Category> itemCategory;
    private ItemPrice itemPrice;
    private String itemDimensions;
    private boolean isItemReadyToBeListed;
    private String itemImagePath;
    private String itemQRCodePath;
    private List<String> itemTags;
    private BigDecimal itemQuantity;
    private boolean isItemSold;

    @Override public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Item item = (Item) o;
        return Objects.equals(itemID, item.itemID);
    }

    @Override public int hashCode() {
        return Objects.hash(itemID);
    }

    public Item(Long itemID,String itemName, String itemDescription, List<Category> itemCategory, ItemPrice itemPrice, String itemDimensions,
            String itemImagePath, String itemQRCodePath, List<String> itemTags, BigDecimal itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.itemDimensions = itemDimensions;
        this.isItemReadyToBeListed = false;
        this.itemImagePath = itemImagePath;
        this.itemQRCodePath = itemQRCodePath;
        this.itemTags = itemTags;
        this.itemQuantity = itemQuantity;
        this.isItemSold = false;
    }

    public Long getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public List<Category> getItemCategory() {
        return itemCategory;
    }

    public ItemPrice getItemPrice() {
        return itemPrice;
    }

    public String getItemDimensions() {
        return itemDimensions;
    }

    public boolean isItemReadyToBeListed() {
        return isItemReadyToBeListed;
    }

    public String getItemImagePath() {
        return this.itemImagePath;
    }

    public String getItemQRCodePath() {
        return this.itemQRCodePath;
    }

    public List<String> getItemTags() {
        return itemTags;
    }

    public BigDecimal getItemQuantity() {
        return itemQuantity;
    }

    public boolean isItemSold() {
        return isItemSold;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(ItemPrice itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDimensions(String itemDimensions) {
        this.itemDimensions = itemDimensions;
    }

    public void setItemReadyToBeListed(boolean itemReadyToBeListed) {
        isItemReadyToBeListed = itemReadyToBeListed;
    }

    public void setItemImage(String itemImagePath) {
        this.itemImagePath = itemImagePath;
    }

    public void setItemQRCodePath(String itemQRCodePath) {
        this.itemQRCodePath = itemQRCodePath;
    }

    public void setItemQuantity(BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemSold(boolean itemSold) {
        isItemSold = itemSold;
    }

    public void addItemTags(String tag) {
        this.itemTags.add(tag);
    }

    public void removeItemTags(String tag) {
        this.itemTags.remove(tag);
    }

    public void addItemCategory(Category category) {
        this.itemCategory.add(category);
    }

    public void removeItemCategory(Category category) {
        this.itemCategory.remove(category);
    }

}
