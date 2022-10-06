package br.com.casadocodigo.products;

import br.com.casadocodigo.store.Author;

public class PhysicalBook extends Book implements Product, Promotion {
    public PhysicalBook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        if (percentage > 0.3) {
            return false;
        }
        double discount = getPrice() * percentage;
        setPrice(getPrice() - discount);
        System.out.println("aplicando desconto ao LivroFisico");
        return true;
    }

    public double getPrinterTax() {
        return this.getPrice() * 0.05;
    }
}
