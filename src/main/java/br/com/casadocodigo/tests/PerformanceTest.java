package br.com.casadocodigo.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerformanceTest {
    public static void main(String[] args) {
        List<String> colecoes = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            colecoes.add("item "+ i);
            set.add("item " + i);
        }
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            set.contains(i);
        }
        long fim = System.currentTimeMillis();
        long time = fim - inicio;
        System.out.println("Demorou " + time + "MS");
    }
}
