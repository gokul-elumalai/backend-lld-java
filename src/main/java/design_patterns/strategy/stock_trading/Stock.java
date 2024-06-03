package main.java.design_patterns.strategy.stock_trading;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Stock {
    private Double price;
    private Double previousPrice;
}
