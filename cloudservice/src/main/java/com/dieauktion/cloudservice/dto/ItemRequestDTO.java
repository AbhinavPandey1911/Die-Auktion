package com.dieauktion.cloudservice.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ItemRequestDTO {

    public final String itemFileName;
    public final MultipartFile itemFile;

}
