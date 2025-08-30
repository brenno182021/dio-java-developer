package application;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();
        //TODO: Complete os espaços em branco com uma possível solução para o desafio
        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}