package net.diegoquirino.calculator.service;


import net.diegoquirino.calculator.model.Product;
import net.diegoquirino.calculator.repository.stub.ProductRepositoryStub;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@DisplayName("Testes do Serviço de Cálculo do Fator de Desconto")
public class ProductDiscountCalculationServiceIntegrationTests {

    @Autowired
    ProductDiscountCalculationService driver;
    static ProductRepositoryStub productRepository;

    //Double productDefaultPric = 100.00;

    @BeforeAll
    public static void setupAll(){
         productRepository = new ProductRepositoryStub();
    }

    @Test
    public void whenDiscountIs10PercentThenProductPriceLower10Percent(){
        // AAA Pattern =>  Arrange, Then Act, Finally Assert
        /* Arrange */
        Double discountFactor = 0.90;
        Product product = productRepository.findById(1L);

        /* Act */
        Product result = driver.calculate(product, discountFactor);

        /* Assert */
        assertThat(result.getPrice(), is(90.00));


    }


}
