package net.diegoquirino.calculator.service;

import net.diegoquirino.calculator.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductDiscountCalculationImplService implements ProductDiscountCalculationService{

    @Override
    public Product calculate(Product product, Double discountFactor) {

        product.setPrice(product.getPrice() * discountFactor);

        return product;
    }
}
