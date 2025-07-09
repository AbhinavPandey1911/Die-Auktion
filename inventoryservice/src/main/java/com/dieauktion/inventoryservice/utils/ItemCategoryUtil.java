package com.dieauktion.inventoryservice.utils;

import java.util.List;
import java.util.stream.Collectors;

import com.dieauktion.inventoryservice.domain.globalenum.Category;

public class ItemCategoryUtil {

    public static List<Category> parseStringToCategory(List<String> categories){
        return categories.stream()
                .map(Category::valueOf)
                .collect(Collectors.toList());
    }

}
