package application;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class LendoEPulandoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] ArraysNomes = new String[0];
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nomes.add(sc.nextLine());
        }

        ArraysNomes = nomes.toArray(ArraysNomes);
        System.out.println(ArraysNomes[2]);//printando o 3 nome da lista
        System.out.println(ArraysNomes[6]);//printando o 7 nome da lista
        System.out.println(ArraysNomes[8]);//printando o 9 nome da lista
    }
}
