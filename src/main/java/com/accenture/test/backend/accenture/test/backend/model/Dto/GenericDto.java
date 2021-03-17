package com.accenture.test.backend.accenture.test.backend.model.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Data
@ToString
@Setter
@Getter
public class GenericDto {

    private Integer status;
    private Object payload;

    public static GenericDto success(Object data) {

        GenericDto genericDto = new GenericDto();
        genericDto.status = (HttpStatus.OK.value());
        genericDto.payload = (data);

        return genericDto;
    }

}