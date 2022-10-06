package br.com.casadocodigo.tests;

import br.com.casadocodigo.store.Author;
import br.com.casadocodigo.products.Cart;
import br.com.casadocodigo.products.Ebook;
import br.com.casadocodigo.products.PhysicalBook;

public class Program {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "Rodrigo Mattos";

        PhysicalBook book = new PhysicalBook(author);
        book.setIsbn("120032.43-43");
        book.setName("Test-Driven development");
        book.setPrice(120.00);
        book.setName("Desvendando o Postgres");

        book.showDetails();
        if (!book.applyDiscount(0.2)) {
            System.out.println("Desconto no livro não pode ser maior que 30%");
        } else {
            System.out.println("Livro depois do desconto " + book.getPrice());
        }

        if (!book.applyDiscount10Percent()) {
            System.out.println("Valor agora é " + book.getPrice());
        }

        Ebook ebook = new Ebook(author);
        ebook.setPrice(80.00);
        ebook.setName("Test-Driven development");

        if (!ebook.applyDiscount(0.3)) {
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com o desconto: " + ebook.getPrice());
        }

        Cart cart = new Cart();
        cart.add(book);
        cart.add(ebook);

        System.out.println("Total " + cart.getTotal());
    }
}