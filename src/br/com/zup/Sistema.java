package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    // Nossa linha de frente com o usuário

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Seja bem vindo a empresa ficticia Universal");
        System.out.println("Digite 1 - para cadastrar um consumidor. ");
        System.out.println("Digite 2 - para cadastrar uma fatura. ");
        System.out.println("Digite 3 - consultar faturas de um consumidor");
        System.out.println("Digite 4 - para sair. ");
    }

    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        double valor = capturarDados("Digite o valor da fatura: ").nextDouble();
        String dataDeVencimento = capturarDados("Digite a data de vencimento: ").nextLine();

        return ServicoFatura.cadastrarFatura(email, valor, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        ServicoConsumidor.validarEmail(email);
        List<Fatura> faturas = ServicoFatura.pesquisarFaturaPeloEmailConsumidor(email);
        return faturas;
    }

}
