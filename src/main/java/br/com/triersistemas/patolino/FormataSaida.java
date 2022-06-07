package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FormataSaida {

    private List<String> nomes;
    private List<String> valores;

    public FormataSaida() {
        this.nomes = new ArrayList<>();
        this.valores = new ArrayList<>();
    }

    public void add(final String nome, final String val) {
        this.nomes.add(nome);
        this.valores.add(val);
    }

    public void print() {

        System.out.println("+---------------------+");
        valores.stream().forEach(p -> System.out.println("|"+p+"|"));
    }
}
