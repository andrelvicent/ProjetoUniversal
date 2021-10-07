package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean continuarExecucao = true;
        while (continuarExecucao){
            try{
                continuarExecucao = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }


    }
}
