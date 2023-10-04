import java.util.ArrayList;
import java.util.Scanner;

import classes.Estudantes;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // criando a arraylist
        ArrayList<Estudantes> minhaLista = new ArrayList<Estudantes>();

        System.out.println("Quantos quartos serão alugados?");
        int numeroQuartosAlugados = sc.nextInt();

        for (int i = 1; i <= numeroQuartosAlugados; i++) {
            System.out.println("Informe o seu nome:");
            String nome = sc.next();
            System.out.println("Informe o seu email:");
            String email = sc.next();
            System.out.println("Informe o quarto que deseja reservar:");
            int numeroQuarto = sc.nextInt();

            Estudantes aluno = new Estudantes(nome, email, numeroQuarto);

            minhaLista.add(aluno);

            // alocando o quarto escolhido
            System.out.println("Reservando o quarto... \n");
            aluno.reservaQuarto(numeroQuarto);
        }

        System.out.println("RELATÓRIO \n");
        for (Estudantes string : minhaLista) {
            System.out.println(string);
        }

    }
}
