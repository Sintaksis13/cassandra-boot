package com.rinatprod.services;

import com.rinatprod.commands.ProductForm;
import com.rinatprod.domain.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
