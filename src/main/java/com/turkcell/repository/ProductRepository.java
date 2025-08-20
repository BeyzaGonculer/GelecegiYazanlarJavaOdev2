package com.turkcell.repository;

import com.turkcell.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Product>{

    List<Product> products = new ArrayList<Product>();
    @Override
    public void save(Product product) {

        products.add(product);
    }
}
