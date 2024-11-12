package ru.gb.vending;

import ru.gb.vending.product.Bottle;
import ru.gb.vending.product.Product;
import ru.gb.vending.vending.VendingMashine;

public class Main {
    public static void main(String[] args) {
        VendingMashine vendingMashine = new VendingMashine();

        Product product1 = new Product("twix", 80);
        Product product2 = new Bottle("coca-cola", 90, 1);
        Product product3 = new Product("lays", 100);

        vendingMashine.addProduct(product1);
        vendingMashine.addProduct(product2);
        vendingMashine.addProduct(product3);

        System.out.println(vendingMashine);
    }
}
