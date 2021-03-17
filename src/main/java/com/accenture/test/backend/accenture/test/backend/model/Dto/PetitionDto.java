package com.accenture.test.backend.accenture.test.backend.model.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

@Setter
@Getter
@Builder
@ToString
@ApiModel(description = "PetitionDto for service consumption")
public class PetitionDto {
    @ApiModelProperty(notes = "The identification client: could be 12345 or 1144201667 ")
    private int client_identification;
    @ApiModelProperty(notes = "The products : could list of products or one product")
    private List<ProductDto> products;
    @ApiModelProperty(notes = "the client's address : could be street 11 # 45 -21")
    private String client_address;

    public boolean validateDto() {
        if (0 == client_identification) {
            return false;
        }
        return validate();
    }

    private boolean validate() {
        if (StringUtils.isBlank(client_address)) {
            return false;
        }
        if (products.isEmpty()) {
            return false;
        }
        return true;
    }
}


