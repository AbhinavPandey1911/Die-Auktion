package com.dieauktion.inventoryservice.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.dieauktion.inventoryservice.domain.globalenum.Category;
import com.dieauktion.inventoryservice.domain.valueobject.ItemPrice;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", updatable = false, unique = true, nullable = false)
    private Long itemID;

    @Column(name = "item_name", nullable = false, length = 255)
    private String itemName;

    @Column(name = "item_description", columnDefinition = "TEXT")
    private String itemDescription;

    //list of enums
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "item_category", joinColumns = @JoinColumn(name = "item_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private List<Category> itemCategory;

    @Embedded
    private ItemPrice itemPrice;

    @Column(name = "item_dimensions")
    private String itemDimensions;

    @Column(name = "is_item_ready_to_be_listed")
    private boolean isItemReadyToBeListed;

    @Column(name = "item_image_path")
    private String itemImagePath;

    @Column(name = "item_qr_code_path")
    private String itemQRCodePath;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "item_tags", joinColumns = @JoinColumn(name = "item_id"))
    @Column(name = "tags")
    private List<String> itemTags;

    @Column(name = "item_quantity")
    private BigDecimal itemQuantity;

    @Column(name = "is_item_sold")
    private boolean isItemSold;

}
