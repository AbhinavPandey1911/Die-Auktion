package com.dieauktion.inventoryservice.service;

import java.math.BigDecimal;
import java.util.List;

import com.dieauktion.inventoryservice.domain.model.Item;
import com.dieauktion.inventoryservice.entity.ItemEntity;
import org.springframework.data.domain.Page;

public interface ItemService {

    public Page<Item> getItems(int page, int size, String sortBy, String sortDir);

    public void addItem();
}
