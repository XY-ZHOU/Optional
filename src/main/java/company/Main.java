package main.java.company;

import main.java.company.model.Product;

import java.util.Optional;

public class Main {
    public static boolean judge(Optional<Product> opt) {
        boolean isPhone = opt.filter(n -> n.getName().equals("手机")).isPresent();
        boolean isPriceSuitable = opt.filter(n -> n.getPrice() >= 1000 && n.getPrice() <= 2000).isPresent();
        return isPhone && isPriceSuitable;
    }
}
