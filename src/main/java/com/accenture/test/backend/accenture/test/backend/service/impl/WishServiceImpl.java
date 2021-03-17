package com.accenture.test.backend.accenture.test.backend.service.impl;

import com.accenture.test.backend.accenture.test.backend.model.Bill;
import com.accenture.test.backend.accenture.test.backend.model.Client;
import com.accenture.test.backend.accenture.test.backend.model.Dto.PetitionDto;
import com.accenture.test.backend.accenture.test.backend.model.ProductsWish;
import com.accenture.test.backend.accenture.test.backend.model.Wish;
import com.accenture.test.backend.accenture.test.backend.repository.BillRepository;
import com.accenture.test.backend.accenture.test.backend.repository.ClientRepository;
import com.accenture.test.backend.accenture.test.backend.repository.ProductWishRepository;
import com.accenture.test.backend.accenture.test.backend.repository.WishRepository;
import com.accenture.test.backend.accenture.test.backend.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class WishServiceImpl implements WishService {
    private final WishRepository wishRepository;
    private final ClientRepository clientRepository;
    private final ProductWishRepository productWishRepository;
    private final BillRepository billRepository;

    @Autowired
    public WishServiceImpl(WishRepository wishRepository, ClientRepository clientRepository, ProductWishRepository productWishRepository, BillRepository billRepository) {
        this.wishRepository = wishRepository;
        this.clientRepository = clientRepository;
        this.productWishRepository = productWishRepository;
        this.billRepository = billRepository;
    }

    @Override
    public List<Wish> consultWish(Long id) {
        return null;
    }

    @Override
    public Bill addWish(PetitionDto petition) {
        if (petition.validateDto()) {
            Client client = clientRepository.findByIdentificationcard(petition.getClient_identification());
            Wish wish = new Wish();
            Date date = new Date();
            wish.setClient_id(client.getClient_id());
            wish.setCreation_date(date);
            wish.setWish_state("Active");
            int wish_id = wishRepository.save(wish).getWish_id();
            AtomicReference<Integer> total = new AtomicReference<>(0);
            petition.getProducts().forEach(productDto -> {
                ProductsWish product_wish = new ProductsWish();
                product_wish.setProduct_id(productDto.getProduct_id());
                product_wish.setQuantity(productDto.getQuantity());
                product_wish.setWish_id(wish_id);
                productWishRepository.save(product_wish);
                total.updateAndGet(v -> v + (productDto.getPrice() * productDto.getQuantity()));
            });
            Bill response = new Bill();
            response.setDate_bill(date);
            response.setWish(wish_id);
            if (total.get() > 70 && total.get() < 99) {
                response.setIva(total.get() * 0.19);
                response.setDomicile(5);
            } else if (total.get() >= 100) {
                response.setIva(0);
                response.setDomicile(0);
            }
            response.setTotal(total.get() + response.getIva() + response.getDomicile());
            billRepository.save(response);
            return response;
        } else {
            return null;
        }
    }

    ;
}
