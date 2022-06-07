package br.com.triersistemas.patolino;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);

        StringBuilder valido = new StringBuilder();
        StringBuilder cpfCnpj = new StringBuilder();


        Farmaceutico farmaceutico = new Farmaceutico();
        Fornecedor fornecedor = new Fornecedor();

        System.out.print("Digite o Cpf: ");
        farmaceutico.setDocumento(farmaceutico.getValidarCpfECnpj().validador(1, sc.nextLine()));
        System.out.print("Data de nascimento: ");
        var dataNascimento = sc.next();

        farmaceutico.setDataDeNascimento
                (LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        for (int i = 0; i < 19 - farmaceutico.getValidarCpfECnpj().getValidar().length(); i++) {
            valido.append(" ");
        }
        for (int i = 0; i < 22 - farmaceutico.getDocumento().length(); i++) {
            cpfCnpj.append(" ");
        }


        System.out.println("+---------------------------+");
        System.out.println("|Válido: " + farmaceutico.getValidarCpfECnpj().getValidar() + valido + "|");
        System.out.println("|CPF: " + farmaceutico.getDocumento() + cpfCnpj + "|");
        System.out.println("|Data: " + farmaceutico.getDataDeNascimento() + "           |");
        System.out.println("|Anos: " + (LocalDate.now().getYear() - farmaceutico.getDataDeNascimento().getYear()) + " anos              |");
        System.out.println("+---------------------------+");

        //System.out.print("Digite o CNPJ: ");
        //fornecedor.setDocumento(fornecedor.getValidarCpfECnpj().validador(2, sc.nextLine()));
        //System.out.println(fornecedor.getDocumento());


        //.out.println(89 % 11);
        // System.out.println("Nome: " + farmaceutico.getNome() + "\nDocumento CPF: " + farmaceutico.getDocumento());
        //System.out.println("Oferta do dia: " + farmaceutico.getOfertaDia());

        // System.out.println("Nome: " + fornecedor.getNome() + "\nDocumento CPF: " + fornecedor.getDocumento());
        // System.out.println("Documento: " + fornecedor.getDocumento());


=======
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
>>>>>>> eb05d70 (Tentando elaborar a logica do box)
    }
}
