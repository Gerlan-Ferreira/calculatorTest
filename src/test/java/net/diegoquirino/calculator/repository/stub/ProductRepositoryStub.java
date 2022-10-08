package net.diegoquirino.calculator.repository.stub;

import net.diegoquirino.calculator.model.Product;
import net.diegoquirino.calculator.repository.ProductRepository;

public class ProductRepositoryStub implements ProductRepository {

    @Override
    public Product findById(Long id) {
        return new Product(1L,100.00);
    }
}
