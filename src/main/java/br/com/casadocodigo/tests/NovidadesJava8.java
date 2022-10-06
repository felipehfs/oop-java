package br.com.casadocodigo.tests;

import br.com.casadocodigo.products.Book;
import br.com.casadocodigo.products.Ebook;
import br.com.casadocodigo.products.PhysicalBook;
import br.com.casadocodigo.store.Author;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NovidadesJava8 {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "Joseph Walker";

        PhysicalBook physicalBook = new PhysicalBook(author);
        physicalBook.setName("Java 8");

        PhysicalBook physicalBook2 = new PhysicalBook(author);
        physicalBook2.setName("Java pratico");

        Ebook ebook = new Ebook(author);
        ebook.setName("Java streams");

        List<Book> books = Arrays.asList(physicalBook, physicalBook2, ebook);

        books.sort(Comparator.comparing(Book::getName));
        books.forEach(l -> System.out.println(l.getName()));

        books.stream()
                .filter(l -> l.getName().contains("Java"))
                .forEach(l -> System.out.println(l.getName()));
    }
}
