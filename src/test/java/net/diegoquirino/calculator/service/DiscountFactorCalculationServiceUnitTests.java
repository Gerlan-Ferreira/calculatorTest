package net.diegoquirino.calculator.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@DisplayName("Testes do Serviço de Cálculo do Fator de Desconto")
public class DiscountFactorCalculationServiceUnitTests {

    @Autowired
    DiscountFactorCalculationService driver;

    String clientType;

    @Nested
    @DisplayName("QUANDO o cliente é do tipo 'A'")
    class ClientTypeA{

        @BeforeEach
        public void setup(){
            clientType = "A";

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 1 e menor que 100 ENTÃO o fator/desconto é 0.90/10%")
        public void whenClient_A_QuantityGreaterOrEqual_1_AndLess_100_ThenDiscount_10_Percent(){
            // AAA Pattern =>  Arrange, Then Act, Finally Assert
            /* Arrange */
            Integer quantityMin = 1;
            Integer quantityMax = 99;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.90));
            assertThat(resultMax, is(0.90));

        }

        @Test
        @DisplayName("E Quatidade maior ou igual a 100 e menor que 1000 ENTÃO o fator/desconto é 0.95/5%")
        public void whenClient_A_QuantityGreaterOrEqual_100_AndLess_1000_ThenDiscount_5_Percent(){

            /* Arrange */
            Integer quantityMin = 100;
            Integer quantityMax = 999;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.95));
            assertThat(resultMax, is(0.95));

        }

        @Test
        @DisplayName("E Quatidade maior ou igual a 1000 ENTÃO o fator/desconto é 1.00/0%")
        public void whenClient_A_QuantityGreaterOrEqual_1000_ThenDiscount_0_Percent(){

            /* Arrange */
            Integer quantityMin = 1000;
            Integer quantityMax = 1001;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(1.00));
            assertThat(resultMax, is(1.00));

        }

    }

    @Nested
    @DisplayName("QUANDO o cliente é do tipo 'B'")
    class ClientTypeB{

        @BeforeEach
        public void setup(){
            clientType = "B";

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 1 e menor que 100 ENTÃO o fator/desconto é 0.85/15%")
        public void whenClient_B_QuantityGreaterOrEqual_1_AndLess_100_ThenDiscount_15_Percent(){

            /* Arrange */
            Integer quantityMin = 1;
            Integer quantityMax = 99;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.85));
            assertThat(resultMax, is(0.85));

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 100 e menor que 1000 ENTÃO o fator/desconto é de 0.90/10%")
        public void whenClient_B_QuantityGreatOrEqual_100_AndLess_1000_ThenDiscount_10_Percent(){

            /* Arrange */
            Integer quantityMin = 100;
            Integer quantityMax = 999;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.90));
            assertThat(resultMax, is(0.90));

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 1000 ENTÃO o fator/desconto é de 0.95/5%")
        public void whenClient_B_QuantityGreatOrEqual_1000_ThenDiscount_5_Percent(){

            /* Arrange */
            Integer quantityMin = 1000;
            Integer quantityMax = 1001;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.95));
            assertThat(resultMax, is(0.95));

        }

    }

    @Nested
    @DisplayName("QUANDO o cliente é do tipo 'C'")
    class ClientTypeC{

        @BeforeEach
        public void setup(){
            clientType = "C";

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 1 e menor que 100 ENTÃO o fator/desconto é 0.80/20%")
        public void whenClient_C_QuantityGreaterOrEqual_1_AndLess_100_ThenDiscount_20_Percent(){

            /* Arrange */
            Integer quantityMin = 1;
            Integer quantityMax = 99;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.80));
            assertThat(resultMax, is(0.80));

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 100 e menor que 1000 ENTÃO o fator/desconto é de 0.85/15%")
        public void whenClient_C_QuantityGreatOrEqual_100_AndLess_1000_ThenDiscount_15_Percent(){

            /* Arrange */
            Integer quantityMin = 100;
            Integer quantityMax = 999;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.85));
            assertThat(resultMax, is(0.85));

        }

        @Test
        @DisplayName("E Quantidade maior ou igual a 1000 ENTÃO o fator/desconto é de 0.90/10%")
        public void whenClient_C_QuantityGreatOrEqual_1000_ThenDiscount_10_Percent(){

            /* Arrange */
            Integer quantityMin = 1000;
            Integer quantityMax = 1001;

            /* Act */
            Double resultMin = driver.calculate(clientType,quantityMin);
            Double resultMax = driver.calculate(clientType,quantityMax);

            /* Assert */
            assertThat(resultMin, is(0.90));
            assertThat(resultMax, is(0.90));

        }

    }

    @AfterEach
    public void tearDown(){

        clientType = null;
    }

}
