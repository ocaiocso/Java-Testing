package exercicioaula3;
import java.util.Scanner;

public class ExercicioAula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tanque t1 = new Tanque();

        System.out.println("Qual volume mínimo do tanque:");
        float min = sc.nextFloat();
        t1.setVolumeMin(min);
        System.out.println("Qual volume máximo do tanque:");
        float capacidade = sc.nextFloat();
        t1.setVolumeMax(capacidade);
        boolean loop = true;

        while(loop){
            float litros;
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Encher ");
            System.out.println("2 - Esvaziar");
            System.out.println("3 - Exibir info");
            System.out.println("4 - Sair");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.println("Quanto deseja encher:");
                    litros = sc.nextFloat();
                    t1.encher(litros);
                    break;
                case 2:
                    System.out.println("Quanto deseja esvaziar:");
                    litros = sc.nextFloat();
                    t1.esvaziar(litros);
                    break;
                case 3:
                    t1.exibirinfos();
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }

    }
}
