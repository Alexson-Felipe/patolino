package br.com.triersistemas.patolino;

import java.time.LocalDate;
import java.util.List;

public abstract class PessoaFisica extends Pessoa {

    private String cpf;

    protected PessoaFisica() {
        this.cpf = this.geraCpf(super.geraDocumento(9));
    }

    protected PessoaFisica(final String nome, final LocalDate aniver, final String cpf) {
        super(nome, aniver);
        this.cpf = super.extractNumbers(cpf);
    }

    public String geraCpf(final List<Integer> digitos) {
        digitos.add(this.mod11(digitos, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        digitos.add(this.mod11(digitos, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        return listToString(digitos);
    }

    @Override
    public Boolean documentoValido() {
        var documento = toListInteger(this.cpf);
        if (documento.size() == 11 && documento.stream().distinct().count() > 1) {
            return geraCpf(documento.subList(0, 9)).equals(this.cpf);
        }
        return false;
    }

    @Override
    public String getDocumento() {
        if (cpf.length() == 11) {
            return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        }
        return cpf;
    }
}
