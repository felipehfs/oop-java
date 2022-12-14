package br.com.casadocodigo.tests;

import br.com.casadocodigo.products.*;
import br.com.casadocodigo.store.Author;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        List<Product> products = Arrays.asList(book, ebook);
        Collections.sort(products);

        for (Product product: products) {
            System.out.println(product);
        }

        System.out.println("Total " + cart.getTotal());
        TicketManager ticketManager = new TicketManager();
        Double discount = ticketManager.validateTicket("CUP1234");
        if (discount != null) {
            System.out.println("Cupom de desconto válido.");
            System.out.println("Valor " + discount);
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }
}
