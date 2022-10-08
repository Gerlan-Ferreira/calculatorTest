package net.diegoquirino.calculator.service;

import net.diegoquirino.calculator.model.Product;

import java.util.Optional;

public interface ProductDiscountCalculationService {


    Product calculate(Product product, Double discountFactor);
}
