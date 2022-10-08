package net.diegoquirino.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountFactorCalculationImplService  implements DiscountFactorCalculationService{
    @Override
    public Double calculate(String clientType, Integer quantity) {

        if (quantity >= 1 && quantity < 100){
            if (clientType.equals("A")) {
                return 0.90;
            } else if (clientType.equals("B")) {
                return 0.85;
            } else if (clientType.equals("C")) {
                return 0.80;
            }
        } else if (quantity >= 100 && quantity < 1000) {

            if (clientType.equals("A")) {
                return 0.95;
            } else if (clientType.equals("B")) {
                return 0.90;
            } else if (clientType.equals("C")) {
                return 0.85;
            }

        } else if (quantity >= 1000) {
            if (clientType.equals("A")) {
                return 1.00;
            } else if (clientType.equals("B")) {
                return 0.95;
            } else if (clientType.equals("C")) {
                return 0.90;
            }
        }
        return null;
    }
}
