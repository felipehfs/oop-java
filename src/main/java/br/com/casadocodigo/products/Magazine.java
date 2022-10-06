package br.com.casadocodigo.products;

import br.com.casadocodigo.store.Author;

public class Magazine  implements Product, Promotion {
    private double price;

    public Magazine(double price) {
        this.price = price;
    }

    @Override
    public boolean applyDiscount(double percentage) {
        return false;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.getPrice());
    }
}
