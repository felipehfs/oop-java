public class MiniBook extends Book implements Product {

    public MiniBook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        return false;
    }
}
