package com.accenture.test.backend.accenture.test.backend.service;

import com.accenture.test.backend.accenture.test.backend.model.Bill;
import com.accenture.test.backend.accenture.test.backend.model.Dto.PetitionDto;
import com.accenture.test.backend.accenture.test.backend.model.Wish;

import java.util.List;

public interface WishService {
    List<Wish> consultWish(Long id);
    Bill addWish(PetitionDto petition);
}
