package net.diegoquirino.calculator.service;

import net.diegoquirino.calculator.model.Product;

public interface ProductDiscountCalculationService {


    Product calculate(Product product, Double discountFactor);
}
