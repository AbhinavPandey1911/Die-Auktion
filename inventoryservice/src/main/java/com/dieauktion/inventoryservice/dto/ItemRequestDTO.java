package com.dieauktion.inventoryservice.dto;

import java.math.BigDecimal;
import java.util.List;

import com.dieauktion.inventoryservice.domain.globalenum.Category;
import com.dieauktion.inventoryservice.domain.valueobject.ItemPrice;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDTO {


    @NotNull
    @NotBlank
    private  String itemName;

    @NotNull
    private  String itemDescription;

    @NotBlank
    @NotNull
    private  List<Category> itemCategory;

    @NotNull
    private  ItemPrice itemPrice;

    @NotBlank
    private  String itemDimensions;

    private  MultipartFile itemImage;

    private   MultipartFile itemQR;

    @Size(max = 10)
    @NotNull
    private  List<String> itemTags;

    @NotNull
    private  BigDecimal itemQuantity;
}
