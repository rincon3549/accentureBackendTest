package com.accenture.test.backend.accenture.test.backend.controller;

import com.accenture.test.backend.accenture.test.backend.model.Dto.GenericDto;
import com.accenture.test.backend.accenture.test.backend.model.Dto.PetitionDto;
import com.accenture.test.backend.accenture.test.backend.service.WishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Wish")
@Api("Wish")
public class WishController {
    final WishService wishService;

    @Autowired
    public WishController(WishService wishService) {
        this.wishService = wishService;
    }

    @PostMapping(path = "/add")
    @ApiOperation(value = "Create Wish", response = PetitionDto.class)
    public ResponseEntity<GenericDto> createCategory(@RequestBody PetitionDto petition) {
        return ResponseEntity.ok().body(GenericDto.success(this.wishService.addWish(petition)));
    }



}
