package br.com.casadocodigo.products;

@FunctionalInterface
public interface Promotion {
    boolean applyDiscount(double percentage);

    default boolean applyDiscount10Percent() {
        return applyDiscount(0.10);
    }
}
