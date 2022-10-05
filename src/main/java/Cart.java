public class Cart {
    private double total;

    public void add(Product book) {
        System.out.println("Adicionando: " + book);
        total += book.getPrice();
    }

    public double getTotal() {
        return total;
    }
}
