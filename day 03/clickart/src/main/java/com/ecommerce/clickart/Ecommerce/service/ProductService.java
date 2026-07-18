package com.ecommerce.clickart.Ecommerce.service;

import com.ecommerce.clickart.Ecommerce.dto.ProductDTO;
import com.ecommerce.clickart.Ecommerce.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;

@Service
public class ProductService {
    //DUMMY DATABASE
    private List<ProductEntity>productList = new ArrayList<>();

    public ProductDTO addProduct(ProductDTO dto) {
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setQuantity((dto.getQuantity()));

        productList.add(entity);
        return dto;
    }
}
