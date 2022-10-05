public class Program {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "Rodrigo Mattos";
        author.email = "rodrigo@gmail.com";
        author.cpf = "123.233.233-12";

        Book book = new Book("120032.43-43", 120.00,
                "Desvendando o Postgres",
                "Aprenda mais sobre os bancos de dados atuais",
                author
                );

        book.showDetails();
    }
}
