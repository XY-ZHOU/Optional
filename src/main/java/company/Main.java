package main.java.company;

import main.java.company.model.Product;

import java.util.Optional;

public class Main {
    public static boolean judge(Optional<Product> opt) {
        boolean isPhone = opt.filter(n -> n.getName().equals("手机")).isPresent();
        boolean isPriceSuitable = opt.filter(n -> n.getPrice() >= 1000 && n.getPrice() <= 2000).isPresent();
        return isPhone && isPriceSuitable;
    }
    public static void main(String[] args) {
        Product productOne = new Product(1, "手机", 1500);
        Product productTwo = new Product(2, "手机", 900);
        Product productThree = new Product(3, "平板", 1700);

        Optional<Product> optOne = Optional.ofNullable(productOne);
        Optional<Product> optTwo = Optional.ofNullable(productTwo);
        Optional<Product> optThree = Optional.ofNullable(productThree);
        Optional<Product> optFour = Optional.ofNullable(null);
        System.out.println(judge(optOne));
        System.out.println(judge(optTwo));
        System.out.println(judge(optThree));
        System.out.println(judge(optFour));

    }
}
