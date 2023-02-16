package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy) {
        return productList.stream()
                .filter(filteringStrategy::filter)
                .collect(Collectors.toList());
    }
}

//        You also need to implement the List executeFilteringStrategy(FilteringStrategy filteringStrategy) method
//        in the ShopStock class, which returns the products for your filtering strategy.
