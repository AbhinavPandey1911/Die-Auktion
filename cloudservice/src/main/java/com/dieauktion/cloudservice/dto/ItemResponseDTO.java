package com.dieauktion.cloudservice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class ItemResponseDTO {
    private final MultipartFile itemImage;
    private final String itemImagePath;

}
