package exercicioaula5;

import java.util.Scanner;

public class calculodeimposto {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PJ pj = new PJ("Caio", "Sao José", 1500.0f, "26.335.351/0001-47");
        PF pf = new PF("Ciro Gomes", "Casa da Mãe", 5300.0f, "120.055.093-53");

        pj.calcularImposto();
        pf.calcularImposto();

        ContaCorrente cc = new ContaCorrente(003-15,123456789, 0.00, pf);
        ContaPoupanca cp = new ContaPoupanca(003-15,987645123, 0.00, pj, 1.05f);

        boolean loop = true;
            while (loop) {
                double valor;
                System.out.println("BEMVINDO!:");
                System.out.println("Selecione sua conta:");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                System.out.println("3 - Sair");

                int conta = sc.nextInt();
                switch (conta) {
                    case 1:
                        System.out.println("------------------:");
                        System.out.println("| CONTA CORRENTE: |");
                        System.out.println("------------------:");
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Depositar ");
                        System.out.println("2 - Sacar ");


                        int num = sc.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Quanto deseja depositar:");
                                valor = sc.nextDouble();
                                cc.depositar(valor);
                                break;
                            case 2:
                                System.out.println("Quanto deseja sacar:");
                                valor = sc.nextDouble();
                                cc.sacar(valor);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("------------------:");
                        System.out.println("| CONTA POUPANÇA: |");
                        System.out.println("------------------:");
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Depositar ");
                        System.out.println("2 - Sacar ");

                        int num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("Quanto deseja depositar:");
                                valor = sc.nextDouble();
                                cp.depositar(valor);
                                break;
                            case 2:
                                System.out.println("Quanto deseja sacar:");
                                valor = sc.nextDouble();
                                cp.sacar(valor);
                                break;
                        }
                        break;
                    case 3:
                        loop = false;
                }
            }



    }
}
