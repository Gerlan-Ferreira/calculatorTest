package net.diegoquirino.calculator.repository;

import net.diegoquirino.calculator.model.Product;

public interface ProductRepository {

    Product findById(Long id);
}
