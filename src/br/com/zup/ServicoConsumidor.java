package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email){
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }




}
