package br.com.casadocodigo.products;

public class Cart {
    private double total;
    private Product[] products = new Product[10];
    private int counter = 0;

    public void add(Product book) {
        System.out.println("Adicionando: " + book);
        try {
            products[counter] = book;
            counter++;
            total += book.getPrice();
        }catch (Exception e) {
            System.out.println("Erro insperado: " + e);
        }

    }

    public void getProducts() {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getPrice());
            }
        }
    }

    public double getTotal() {
        return total;
    }
}
