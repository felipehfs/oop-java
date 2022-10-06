package br.com.casadocodigo.products;

import br.com.casadocodigo.store.Author;

public class Magazine extends Book implements Product, Promotion {

    public Magazine(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        return false;
    }
}
