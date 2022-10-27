package __exercicioaula11;

import java.util.*;

public class Eleicoes {

    public static void main(String args[]) {

        Urna urna = new Urna();

        int votos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(urna.getVotos().size());
        while(votos < 5) {
            try {
                System.out.println("ELEICOES 2021 - PREFEITURA FICTICIA");
                System.out.println("====================================");
                System.out.print("Digitie o numero o candidato: ");
                int op = sc.nextInt();
                Candidato c = urna.getCandidato(op);
                System.out.print("Deseja votar no "+c.getNome()+" (S/N)?");
                String resposta = sc.next();
                if(resposta.equals("S")) {
                    urna.inserirVoto(op);
                    votos++;
                    System.out.println("Voto confirmado!");
                }
            }
            catch(UrnaException ue) {
                System.out.println(ue.getMessage());
            }
        }
        Vector<Candidato> r = urna.contabilizar();
        System.out.println("Votos Contabilizados ");
        for(Candidato c: r){
            System.out.println("__exercicioaula11.Candidato "+c.getNome()+" total de votos "+c.getTotalVotos());
        }
        /*
         Contabilizar o total de votos de cada candidato, e exibir em ordem decrescente a
        quantidade de votos.
        */

    }

}