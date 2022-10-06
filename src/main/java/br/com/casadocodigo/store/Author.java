package br.com.casadocodigo.store;

public class Author {
    public String name;
    public String email;
    public String cpf;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Author)) return false;
        Author other = (Author) obj;
        return this.name.equals(other.name);
    }
}
