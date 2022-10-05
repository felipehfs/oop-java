public class Cart {
    private double total;

    public void add(Book book) {
        System.out.println("Adicionando: " + book);
        book.applyDiscount(0.05);
        total += book.getPrice();
    }

    public double getTotal() {
        return total;
    }
}
