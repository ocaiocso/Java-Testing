import java.util.Scanner;

public class aula_2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o consumo médio do carro: ");
        float cm = sc.nextFloat();

        System.out.print("Quantos litros possui no tanque: ");
        float tanque = sc.nextFloat();

        Carro carro1 = new Carro(cm,tanque);

        while(carro1.tanque>0) {

            System.out.print("Entre com a velocidade média do carro: ");
            float vm = sc.nextFloat();

            System.out.print("Entre com o tempo da viagem: ");
            float t = sc.nextFloat();

            carro1.setarVelocidade(vm,t);

            System.out.println("Tanque: "+carro1.tanque+" Odometro: "+carro1.odometro);
        }


    }

}