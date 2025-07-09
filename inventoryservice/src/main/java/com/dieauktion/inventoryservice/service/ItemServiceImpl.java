package com.dieauktion.inventoryservice.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.dieauktion.inventoryservice.domain.globalenum.Category;
import com.dieauktion.inventoryservice.domain.model.Item;
import com.dieauktion.inventoryservice.domain.valueobject.ItemPrice;
import com.dieauktion.inventoryservice.entity.ItemEntity;
import com.dieauktion.inventoryservice.mapper.ItemMapper;
import com.dieauktion.inventoryservice.repository.ItemRepository;
import com.dieauktion.inventoryservice.utils.ItemCategoryUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public Page<Item> getItems(int page, int size, String sortBy, String sortDir) {
        Sort.Direction direction = sortDir.equalsIgnoreCase("desc") ?
                Sort.Direction.DESC : Sort.Direction.ASC;
        Sort sort = Sort.by(direction, sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<ItemEntity> fetchedItemEntities = itemRepository.findAll(pageable);
        return fetchedItemEntities.map(itemMapper::toItem);
    }

    @Override public void addItem() {
        Item sampleItem = new Item(
                null, // ID will be auto-generated
                "Sample Item",
                "This is a sample item description",
                Arrays.asList(Category.MILITARIA), // Assuming ELECTRONICS exists
                new ItemPrice("USD", new BigDecimal("29.99")),
                "15x10x5 cm",
                "/images/sample.jpg",
                "/qr/sample.png",
                Arrays.asList("sample", "default", "test"),
                new BigDecimal("1")
        );
        System.out.println(sampleItem.getItemQRCodePath());
        ItemEntity itemEntity = itemMapper.toItemEntity(sampleItem);
        itemRepository.save(itemEntity);
    }

}
