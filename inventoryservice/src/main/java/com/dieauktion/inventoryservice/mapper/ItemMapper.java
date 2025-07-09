package com.dieauktion.inventoryservice.mapper;

import java.util.List;

import com.dieauktion.inventoryservice.domain.model.Item;
import com.dieauktion.inventoryservice.entity.ItemEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    Item toItem(ItemEntity itemEntity);

    ItemEntity toItemEntity(Item item);

}
