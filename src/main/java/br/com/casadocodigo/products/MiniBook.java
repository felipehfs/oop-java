package br.com.casadocodigo.products;

import br.com.casadocodigo.store.Author;

public class MiniBook extends Book implements Product {

    public MiniBook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        return false;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.getPrice(), other.getPrice());
    }
}
