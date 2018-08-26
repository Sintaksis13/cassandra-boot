package com.rinatprod.converters;

import com.rinatprod.commands.ProductForm;
import com.rinatprod.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        if (product.getId() != null && !StringUtils.isEmpty(product.getId())) {
            productForm.setId(product.getId());
        }
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
