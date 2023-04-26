package com.maida.golf.sorteadorgolfe.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SorteadorModel {

    public static String sortearTaco() {

        Random numero = new Random();

        List<String> tacos = Arrays.asList("Pitch", "Sand", "Ferro 7", "Ferro 9");
        int index = numero.nextInt(4);

        return tacos.get(index);
    }

    public static String sortearAlvo(String tacoSorteado) {

        Random numero = new Random();
        List<String> alvos;
        int index = numero.nextInt(3);

        switch (tacoSorteado) {
            case "Pitch":
                alvos = Arrays.asList("Placa de 100", "Bandeira do meio", "Cabo de aço");
                break;

            case "Sand":
                alvos = Arrays.asList("Bandeira de 25", "Bandeira do meio", "Cabo de aço");
                break;
            case "Ferro 9":
                alvos = Arrays.asList("Placa de 150", "Bandeira do meio", "Morro");
                break;

            default:
                alvos = Arrays.asList("Placa de 200", "Fundo da Rede", "Morro");
                break;
        }

        return alvos.get(index);
    }

}
