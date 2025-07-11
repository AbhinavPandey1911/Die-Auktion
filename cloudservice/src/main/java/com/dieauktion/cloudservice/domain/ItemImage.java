package com.dieauktion.cloudservice.domain;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


@Data
public class ItemImage {

    private final String itemFileName;
    private final MultipartFile itemFile;

}
