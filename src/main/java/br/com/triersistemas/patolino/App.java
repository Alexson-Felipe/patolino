package br.com.triersistemas.patolino;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {

        var fs = new FormataSaida();
        Fornecedor f = new Fornecedor("Carlão", LocalDate.of(1915, Month.APRIL, 21), "00000000000191");
        fs.add("Nome", f.getNome());
        fs.add("Produtos", f.getProdutos().toString().replace("[","").replace("]",""));
        fs.add("CNPJ", f.getDocumento());
        fs.add("Valido", f.documentoValido().toString());
        fs.add("Aniver", f.getAniver());
        fs.add("Idade", f.getIdade().toString());
        fs.print();

        fs = new FormataSaida();
        Farmaceutico fa = new Farmaceutico("Dr Gastão", LocalDate.of(1945, Month.JUNE, 15)," 077.805.980-47 ");
        fs.add("Nome", fa.getNome());
        fs.add("Promoção", fa.getPromocaoDia());
        fs.add("CPF", fa.getDocumento());
        fs.add("Valido", fa.documentoValido().toString());
        fs.add("Aniver", fa.getAniver());
        fs.add("Idade", fa.getIdade().toString());
        fs.print();

    }
}
