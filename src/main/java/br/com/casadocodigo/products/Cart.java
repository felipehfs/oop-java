package br.com.casadocodigo.products;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double total;
    private List<Product> products;
    private int counter = 0;
    public  Cart () {
        this.products = new ArrayList<>();
    }

    public void add(Product book) {
        products.add(book);
        total += book.getPrice();
    }

    public List<Product> getProducts() {
       return products;
    }

    public double getTotal() {
        return total;
    }
}
