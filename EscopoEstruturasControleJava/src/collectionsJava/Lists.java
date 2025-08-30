package application.collectionsJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {

        //Todo: Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        //"Telefonou para a vítima?"
        //"Esteve no local do crime?"
        //"Mora perto da vítima?"
        //"Devia para a vítima?"
        //"Já trabalhou com a vítima?"
        //Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina".
        // Caso contrário, ela será classificado como "Inocente".


        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Perguntas: ");
        System.out.println("\nTelefonou para a vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println(respostas);
        sc.close();

        int quantidadeRespostasPositiva = (int) respostas.stream().filter(e -> e.contains("s")).count();

        switch(quantidadeRespostasPositiva) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }


    }
}
