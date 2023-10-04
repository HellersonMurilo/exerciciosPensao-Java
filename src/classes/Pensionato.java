package classes;

import java.util.Scanner;

public abstract class Pensionato {
    
    private int[] quartoPensao = new int[10];

    // Construtor
    public Pensionato() {
        // Inicialize todos os quartos como disponíveis
        for (int i = 0; i < quartoPensao.length; i++) {
            quartoPensao[i] = 0;
        }
    }

    public int[] getQuartoPensao() {
        return quartoPensao;
    }

    public void setQuartoPensao(int[] quartoPensao) {
        this.quartoPensao = quartoPensao;
    }

    // Método para reservar um quarto
    public void reservaQuarto(int numeroQuarto) {
        if (numeroQuarto >= 1 && numeroQuarto <= 10) {
            if (quartoPensao[numeroQuarto - 1] == 0) {
                // O quarto está disponível, então podemos reservá-lo
                quartoPensao[numeroQuarto - 1] = 1; // 1 indica que o quarto está ocupado
                System.out.println("Quarto " + numeroQuarto + " reservado com sucesso.\n");
            } else {
                System.out.println("O quarto " + numeroQuarto + " já está ocupado.\n");
            }
        } else {
            System.out.println("Número de quarto inválido. Escolha um quarto entre 1 e 10.\n");
        }
    }
    
}

