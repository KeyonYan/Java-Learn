package com.keyon.future;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@AllArgsConstructor
@Data
public class Shop {

    String name;

    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture.supplyAsync(()->calculatePrice(product));
    }

    public String getPrice(String product) {
        double price = calculatePrice(product);
        Discount.Code code = Discount.Code.values()[Util.random.nextInt(Discount.Code.values().length)];
        return String.format("%s:%.2f:%s", name, price, code);
    }

    private double calculatePrice(String product) {
        Util.delay();
        return Util.random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

}
