package exercicioaula4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo primitivo de exercicioaula4.PI: ");
        System.out.println("1- exercicioaula4.PI em Double");
        System.out.println("2- exercicioaula4.PI em Int");
        System.out.println("3- exercicioaula4.PI em Float");
        System.out.println("4- exercicioaula4.PI em String");

        PI pi = new PI();

        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.println("exercicioaula4.PI em Double: "+ pi.getDouble());
                break;
            case 2:
                System.out.println("exercicioaula4.PI em Int: " + pi.getInt());
                break;
            case 3:
                System.out.println("Pi em Float: " + pi.getFloat());
                System.out.println();
                break;
            case 4:
                System.out.println("exercicioaula4.PI em String: " + pi.getString());
                break;
        }
    }
}
