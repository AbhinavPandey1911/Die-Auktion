package com.dieauktion.inventoryservice.controller;

import com.dieauktion.inventoryservice.domain.model.Item;
import com.dieauktion.inventoryservice.dto.ItemRequestDTO;
import com.dieauktion.inventoryservice.entity.ItemEntity;
import com.dieauktion.inventoryservice.service.ItemServiceImpl;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/inventory") public class ItemController {

    private final ItemServiceImpl itemService;

    public ItemController(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public Page<Item> getItems(@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "itemID") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {
        System.out.println("calling get all items");
        itemService.addItem();
        return itemService.getItems(page,size,sortBy,sortDir);
    }

    @PostMapping(value = "/items", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addItems(@ModelAttribute @Valid ItemRequestDTO itemRequestDTO){
        System.out.println(itemRequestDTO);
        System.out.println(itemRequestDTO.getItemPrice().getCurrency());
        /*
            Add the feign call to Amazon services to upload images there
         */


    }

}
