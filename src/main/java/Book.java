public abstract class Book {
    private String isbn;
    private double price;
    private String name;
    private String description;
    private Author author;

    public Book(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showDetails() {
        String message = "Mostrando detalhes do livro";
        System.out.println(message);
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(isbn);
    }

    public abstract  boolean applyDiscount(double percentage);
}
