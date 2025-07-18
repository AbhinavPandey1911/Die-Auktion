package com.dieauktion.inventoryservice.repository;

import com.dieauktion.inventoryservice.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

}
